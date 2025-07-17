let numberofplayers = 0;
let currentplayer = 0;
let currentround = 1;
const maxrounds = 3;
let scores = [];

function startGame(players) {
  numberofplayers = players;
  scores = Array.from({ length: players }, () => []);
  document.getElementById('player-selection').classList.add('hidden');
  document.getElementById('game-area').classList.remove('hidden');
  document.getElementById('result').classList.add('hidden');
  document.getElementById('new-game-btn').classList.add('hidden');
  document.getElementById('roll-btn').classList.remove('hidden');
  document.getElementById('round-info').classList.remove('hidden');
  currentplayer = 0;
  currentround = 1;
  updateroundinfo();
  displayPlayers();
  document.getElementById('dice-container').classList.add('hidden');
}

function updateroundinfo() {
  document.getElementById('round-info').innerText = `🎲 Round ${currentround} - Player ${currentplayer + 1}'s turn`;
}

function displayPlayers() {
  const playersdiv = document.getElementById('players');
  playersdiv.innerHTML = '';
  scores.forEach((scorearr, index) => {
    const total = scorearr.reduce((a, b) => a + b, 0);
    const playerdiv = document.createElement('div');
    playerdiv.className = 'player';
    if (index === currentplayer) {
      playerdiv.classList.add('active');
    }

    playerdiv.innerHTML = `
      <div class="title">Player ${index + 1}</div>
      <div class="score">Rolls: ${scorearr.join(', ') || '—'}</div>
      <div class="score">Total: ${total}</div>
    `;
    playersdiv.appendChild(playerdiv);
  });
}

function Rolldice() {
  document.getElementById('roll-btn').disabled = true;

  const dicecontainer = document.getElementById('dice-container');
  const diceimage = document.getElementById('dice-image');
  dicecontainer.classList.remove('hidden');

  diceimage.classList.add('shaking');
  let animationcount = 0;
  const animationlimit = 6;

  const animationinterval = setInterval(() => {
    const randomface = Math.floor(Math.random() * 6) + 1;
    diceimage.src = getdiceimageurl(randomface);
    animationcount++;

    if (animationcount >= animationlimit) {
      clearInterval(animationinterval);
      diceimage.classList.remove('shaking');

      const roll = Math.floor(Math.random() * 6) + 1;
      diceimage.src = getdiceimageurl(roll);

      
      scores[currentplayer].push(roll);
      displayPlayers();
      updateroundinfo();

      setTimeout(() => {
        if (currentplayer < numberofplayers - 1) {
          currentplayer++;
        } else {
          if (currentround < maxrounds) {
            currentplayer = 0;
            currentround++;
          } else {
            endGame();
            return;
          }
        }

        updateroundinfo(); 
        displayPlayers(); 
        document.getElementById('roll-btn').disabled = false;
      }, 600); 
    }
  }, 30);
}

function getdiceimageurl(num) {
  return `dice${num}.png`; 
}

function endGame() {
  document.getElementById('roll-btn').classList.add('hidden');
  document.getElementById('round-info').classList.add('hidden');
  document.getElementById('dice-container').classList.add('hidden');

  let maxscore = 0;
  let winner = [];

  const totalscores = scores.map(arr => arr.reduce((a, b) => a + b, 0));
  totalscores.forEach((score, i) => {
    if (score > maxscore) {
      maxscore = score;
      winner = [i];
    } else if (score === maxscore) {
      winner.push(i);
    }
  });

  const resultdiv = document.getElementById('result');
  resultdiv.classList.remove('hidden');

  if (winner.length === 1) {
    resultdiv.innerText = `🎉 Player ${winner[0] + 1} wins with ${maxscore} points!`;
  } else {
    const tiedplayers = winner.map(i => i + 1).join(', ');
    resultdiv.innerText = `🤝 It's a tie between Players ${tiedplayers} with ${maxscore} points!`;
  }

  document.getElementById('new-game-btn').classList.remove('hidden');
}

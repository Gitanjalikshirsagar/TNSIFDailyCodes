import random

# Define the number of players
players = ["Player 1", "Player 2", "Player 3", "Player 4"]

# Dictionary to store distances
scores = {}

print("🎯 Welcome to the Disc Throw Game!")
print("Each player will throw the disc once. The longest throw wins!\n")

# Simulate disc throws
for player in players:
    input(f"{player}, press Enter to throw the disc...")
    distance = round(random.uniform(10, 100), 2)  # distance in meters
    scores[player] = distance
    print(f"{player} threw the disc {distance} meters!\n")

# Determine the winner
winner = max(scores, key=scores.get)
print("🏆 Game Over!")
print("Scores:")
for player, score in scores.items():
    print(f"{player}: {score} meters")

print(f"\n🎉 {winner} wins with a throw of {scores[winner]} meters!")


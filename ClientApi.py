import requests
import json

class Client:
    def __init__(self, base_url="http://localhost:8080"):
        self.base_url = base_url

    def get_players(self):
        response = requests.get(f"{self.base_url}/players")
        return response.json()

    def get_player(self, player_id):
        response = requests.get(f"{self.base_url}/players/{player_id}")
        return response.json()

    def create_player(self, player_id, first_name, last_name):
        data = {
            "id": player_id,
            "prenom": first_name,
            "nom": last_name
        }
        headers = {'Content-Type': 'application/json'}
        response = requests.post(f"{self.base_url}/players", data=json.dumps(data), headers=headers)
        return response.json()

    def delete_player(self, player_id):
        response = requests.delete(f"{self.base_url}/players/{player_id}")
        return response.status_code

    def update_player(self, player_id, first_name, last_name):
        data = {
            "prenom": first_name,
            "nom": last_name
        }
        headers = {'Content-Type': 'application/json'}
        response = requests.put(f"{self.base_url}/players/{player_id}", data=json.dumps(data), headers=headers)
        return response.json()


if __name__ == "__main__":
    client = Client()

    # Get all players
    print(client.get_players())

    # Get a specific player
    print(client.get_player(1))

    # Create a new player
    print(client.create_player(3, "Ismaïl", "Bennacer"))

    # Delete a player
    print(client.delete_player(3))

    # Update a player
    print(client.update_player(1, "Ismaïl", "Bennacer"))

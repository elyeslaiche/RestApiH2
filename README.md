# RestApiH2

This project is a RESTful API built with Java, using the Spring Boot framework and the H2 in-memory database. The API is consumed by a Python client.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven
- An IDE that supports Spring Boot (e.g., IntelliJ IDEA, Spring Tools Suite, Eclipse)
- Python 3.6 or later
- pip: This is the package installer for Python. It comes installed with the newer Python versions.

### Cloning the project

1. Navigate to the directory where you want to clone the project.
2. Open a terminal or command prompt in this directory.
3. Run the following command:

```bash
git clone https://github.com/elyeslaiche/RestApiH2.git
```

### Setting up the environment

After cloning the project, open it in your preferred IDE.

To build the project, navigate into the project directory via the terminal and run the following Maven command:

```bash
mvn clean install
```

To install the necessary Python libraries for the client, you can do this by running:

```bash
pip install requests
```

### Running the application

In your IDE, run the `RestApiH2Application` class, or you can run the application from the command line using the following command:

```bash 
mvn spring-boot:run
```

Your Spring Boot application should now be running!

To run the Python client, navigate to the directory where the Python script is located and run:

```bash
python ClientApi.py
```

## Usage

This REST API provides basic CRUD operations for managing data related to Teams and Players. The Python client provides functions to get recent players, get all teams, and write a new player.

## License

This project is licensed under the MIT License.

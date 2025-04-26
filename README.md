# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: Motheraju Krishna Prasad

*INTERN ID*: CT04DA187

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEEKS

*MENTOR*: NEELA SANTOSH

## Project Description

This Java command-line movie recommender project was created to explore how simple recommendation systems can be built using core Java and basic data handling. My main goal was to design a system that could suggest movies to users based on genre or by finding similar movies, all through a straightforward terminal interface. Working on this project helped me deepen my understanding of Java collections, file I/O, and the basics of filtering and searching data efficiently.

The application is organized around three main components: App.java, Movie.java, and MovieDataLoader.java. The App.java file contains the main logic for the command-line interface, presenting users with a menu to choose how they want to receive recommendations. Movie.java defines the data model for each movie, including its name and genre. MovieDataLoader.java is responsible for reading the movie data from a CSV file and loading it into memory. The movies.csv file itself contains a sample dataset of movie names and genres, which the application uses to generate recommendations.

When the program starts, it loads all movie data from the CSV file. Users can then interact with the menu to either get recommendations by genre, find movies similar to a given title (based on genre), or simply list all available movies. The recommendation logic is implemented using Java streams, which makes filtering and searching through the dataset both concise and efficient. This approach also makes it easy to extend the system in the future, for example by adding more advanced recommendation algorithms or integrating with external APIs.

I structured the project as follows:

## Project Structure

The project follows a standard Maven directory layout. Here is the structure in tree form:

```
movie-recommender/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── recommender/
│   │   │               ├── App.java
│   │   │               ├── Movie.java
│   │   │               └── MovieDataLoader.java
│   │   └── resources/
│   │       └── movies.csv
├── pom.xml
└── README.md
```

- **App.java**: The main class that contains the CLI logic and user interaction.
- **Movie.java**: The data model representing a movie with fields for id, name, and genre.
- **MovieDataLoader.java**: Loads movie data from the CSV file.
- **movies.csv**: A sample dataset containing movie names and genres.
- **pom.xml**: Maven configuration file with dependencies and plugins.
- **README.md**: This documentation file.

## How the Project Works

When the application starts, it loads the list of movies from the `movies.csv` file using the `MovieDataLoader` class. The user is presented with a simple menu in the terminal, where they can choose to get recommendations by genre, find similar movies, list all movies, or exit the program. If the user selects to recommend by genre, they enter a genre and the system lists all movies matching that genre. If the user wants similar movies, they enter a movie name and the system finds other movies in the same genre. The logic is implemented using Java streams for efficient filtering and searching.

## References and Tools Used

To develop and test the application, I used Visual Studio Code (VS Code) as my IDE. VS Code made it easy to manage the project files, edit code, and use the integrated terminal for compiling and running the application. For learning and troubleshooting, I referred to several YouTube tutorials and articles found through Google searches. These resources were invaluable for understanding best practices in Java file handling and stream operations. I also used ChatGPT for some light help with code structure and clarifying certain Java concepts.

This project was inspired by a variety of online resources, including YouTube videos on Java CLI projects and blog posts about building simple recommendation engines. The process of building this recommender system gave me practical experience with Java's file I/O, collection manipulation, and stream API. It also reinforced the importance of clean code organization and modular design, making it easier to maintain and extend the project in the future.

Overall, this movie recommender system serves as a solid foundation for anyone interested in learning about basic recommendation logic and Java programming. It can be expanded with features like user profiles, ratings, or integration with larger movie databases. For now, it stands as a practical example of how to build a functional, user-friendly CLI application in Java, drawing on a mix of online learning and hands-on experimentation. 



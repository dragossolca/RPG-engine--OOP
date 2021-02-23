# RPG-engine--OOP
A simple RPG engine designed for me to practice OOP

We have 5 classes:
- Element
```
contains:

- fields: name, description
- empty constructor
- getter for description (abstract)
- setter for description (abstract)
- getter for type("DECOR") (abstract)
```
- Decor: extends the Element class
```
contains :

- empty constructor
- constructor using name and description fields
- getter for description
- setter for description
- getter for type("DECOR")
```

- Niveau (eng. Level)
```
contains :

- fields: carte(eng. map) of type Element, PJ(Personnage Joueur/ Main Character of type Personnage, titre of type String
- setter for Element
- decritCarte(eng. describeMap) returns a description of the map (String)
- getter for Main Character of type Personnage
- setter for Main Character of type Personnage
- getter for title(fr. titre)
- constructor using a field of type Personnage 
```

- Objet (eng. Object)
```
contains :

- empty constructor
- constructor using name and description fields
- getter for description
- setter for description
- getter for type("OBJET")
- getter for name
- toString method
```

- Personnage (eng. Character):
```
contains:
- fields: name(String), health(int), maxHealth(int), inventory(ArrayList)
- empty contructor
- constructor using the fields: name, health, maxHealth
- getter for description
- getter for type("PERSONNAGE")
- getter/ setter for name
- getter/ setter for health
- getter/ setter for maxHealth
- afficheInventoire-> shows the inventory
- ajouteObjet -> adds an object
- poseObjet - > removes an object
- setter for description
- toString method
```
and a Main one: TestJeuRPG in which we call the methods from the other classes as we wish

Usage:
Run the Main Class (TestJeuRPG)

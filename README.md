# StrategyDesignPattern
I have created a simple same strategy design pattern in which main class context class have private member mood of class IMoodStrategy. IMoodStrategy Interface which contains toDo method which return what they want to do in different moods. there are 4 classes which are implementing IMoodStrategy overrides the toDo() according to the class and prints what they want to do.
ProjectApplication is main application class which calls different strategies and prints output according to the moods of context objects

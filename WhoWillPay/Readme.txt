In this project I built a random name picker for some fun. Main idea of this project is when some people goes to restaurant or some place then they will use this app for choosing someone who will pay for dinner. 
For example Alex, Adam and Johnny went to restaurant and they wanna choose a random name for paying. 

Project definition:
There is a listView in main activity, editText and three Buttons which are for adding new name, clearing listView and selecting a lucky person for paying. There is a second activity for result. We could add result to main activity but it would not be beautiful. With the help of second activity app is a little bit more elegant. Names are stored in a ArrayList and it used for ArrayList adapter. Name will be selected randomly. 
If there is no name inside ArrayList than toast message appears in order to make dialog to user better. Also user cannot add any empty value inside ArrayList. 

Bad side of Project:
The bad side of project is using ListView instead of RecyclerView. ListView is not efficient due to update problem. When some operations made to ArrayList like clearing ArrayList and adding new name to it ListView does not change itself immediately. It just update itself when you do another operation.

I will try to make another version of this app in future which contains RecyclerView, clickListener and may be some animations. 
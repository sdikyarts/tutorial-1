# AdPro 2023-2024/2

### Name: Yasmine Putri Viryadhani
### NPM: 2206081862
### Class: Adpro A

# Tutorial 1
## Reflection 1
After finishing Tutorial 1, I learned that it takes workweb is not easy. At first, I encountered the need for my MacBook to be compatible with the SpringBoot and Gradle. Then, my friend encouraged me to switch to Windows, which worked. Furthermore, I encountered some difficulties handling the syntax due to its Java-based web development. With the help of my friends and the documentation given, I managed to finish the tutorial.

Some Clean Code Principles that I've implemented in this Tutorial are listed below:
1. **Meaningful Names** – Variable names should represent their functionality, so we don't need to add comments.
2. **Function** – Clean codes in functions are necessary so the codes fit in the screen's width.
3. **Comment** - Comment less!
4. **Object and Data Structures** – Implementing OOP and Interfaces that we've learned on DDP2
5. **Error Handling** – There are A LOT of things we need to handle, including errors we've encountered.

I have yet to implement secure coding because I haven't learned how to implement user authentication in SpringBoot. After this tutorial, I plan to improve my clean coding and fix the GET and POST in the Controller (I should have used PUT and DELETE, but it didn't work before).

## Reflection 2
1. After writing unit tests, I feel really exhausted since we have to debug our code to find what error is inside our **main**. The test amounts in a Class depend on how complex our code is. 100% Code Coverage doesn't guarantee that the code has no bugs or errors.
2. Suppose we make a functional test to check the number of items in the new class but use the same setups. It will affect the clean code and make it look filthy since we have indirectly "duplicated" the existing code and reduced its quality. To fix that, we need to make reusable setups and instance variables. For example, we can make a superclass so that we can extend the class without worrying about duplicating the code.

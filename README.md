# Trampoline
A trampoline is a loop that repeatedly runs functions. Each function, called a thunk, returns the next function for the loop to run. The trampoline never runs more than one thunk at a time, so if you break up your program into small enough thunks and bounce each one off the trampoline, then you can be sure the stack won't grow too big.

Trampolined code is harder to read and write, and it executes more slowly. However, trampolines can be invaluable when your program would otherwise run out of stack space, and the only other alternative is to convert it into an imperative style.


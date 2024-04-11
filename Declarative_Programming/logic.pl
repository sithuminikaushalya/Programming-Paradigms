% Fact: Socrates is a man
man(socrates).

% Rule: X is mortal if X is a man
mortal(X) :- man(X).

% Query: Is Socrates mortal?
?- mortal(socrates).
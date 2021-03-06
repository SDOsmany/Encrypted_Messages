# Encrypted_Messages
Cryptography, the study of secret writing, has been around for a very long time, from simplistic 
techniques to sophisticated mathematical techniques. No matter what the form however, there are 
some underlying things that must be done – encrypt the message and decrypt the encoded message. 
One of the earliest and simplest methods ever used to encrypt and decrypt messages is called the 
`Caesar cipher method`, used by Julius Caesar during the Gallic war. According to this method, letters 
of the alphabet are shifted by three, wrapping around at the end of the alphabet. For example,

PlainTest: &emsp;  `a b c d e f g h i j k l m n o p q r s t u v w x y z`

Caesar shift: `d e f g h I j k l m n o p q r s t u v w x y z a b c`

When encrypting a message, you take each letter of the message and replace it with its corresponding 
letter from the shifted alphabet. To decrypt an encoded message, you simply reverse the operation. 
That is, you take the letter from the shifted alphabet and replace it with the corresponding letter from 
the plaintext alphabet. Thus the string the `quick brown fox` becomes `wkh txlfn eurzq ira` 

Another type of cipher is known as `Transposition cipher`. In this type of cipher, letters in the original 
message are re-arranged in some methodical way – for instance, reverse the letters in each string. 
Thus the string the `quick brown fox` becomes ``eht kciuq nworb xof`

Still yet another cipher method is the `Reverser cipher`. This method does not only reverses the letters 
in each word, but as does the Transposition cipher, but it also reverses the result generated from the 
Transposition cipher. Hence the original message the `quick brown fox` becomes `xof nworb kciuq eht`

<br />

`Class design`

Here are three Cryptography methods – `Caesar`, `Transposition` and `Reverser`. They all have 
something in common. They encrypt and decrypt messages. That is, they take a string of words and 
translate each word using the encoding algorithm appropriate for that cipher. Thus each class cipher 
will need polymorphic encode() and decode() methods, which take a word and encodes and decodes 
it according to the rule of the particular cipher. 

From a design perspective, the encrypt() method and the decrypt() methods will be the same for 
every class. They simply break message into words and have each word encode or decode. However, 
the encode and decode methods will be different for each cipher. The figure shows a hierarchy of the 
classes.

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;![Capture](https://user-images.githubusercontent.com/58539319/120116082-6886a400-c154-11eb-9994-289fffc5ec3e.PNG)


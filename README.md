In order to run this program the Driver class is CreateGallerySimulation.java


Final Project for Software Developement class
General Description:
When visiting the Senate Washington DC, you may want to go to the visitor’s gallery. There are 90 seats in the gallery. Spectators enter in groups of 35, but only when a block of 35 seats become available. If there are less than 35 waiting you can bring them in, as long as there are at least 35 spots in the gallery. Each person may stay as long as they like (as we describe below). VIPs get to go the front of the line.

Write a program using a Deque to simulate the waiting line for the Senate gallery. Assume that the gallery is initially empty and that 100 people are waiting on the line at time 0, including 4 VIPs. (Note: you must use Deque for the queues)

After the doors are opened 3 regular persons arrive every minute, and one VIP every 5 minutes.

20% of all persons stay in the gallery for 5 minutes, 60% for 10 minutes, and 20% for 20 minutes.
Simulate  simMinutes.
Calculate the average wait-time for regular people, and the average wait time for VIPs including those who got into the gallery and are still in the gallery and those who have already left.

This project was done using Java through the IDE NetBeans


Main Objective:
The main goal was to implement data structures to a simulation using inheritance to help with different ticket descriptions. Obviously the VIP ticket holders had more priority in the line than the regular ticket holders. Which is why we needed to use data structures like Deque to impement that into the simulation. 

Challenges:
At this point of the semester, we'd already done multiple projects using data structures ranging from Nodes, LinkedList, stack, Queue, List, and ArrayList. So I was pretty comfortable programming recording data into lists. The most challenging part was creating a algorithm that fit every requiremnt of the instruction. Specifically simulating the minutes each person took in the gallery. The first thought that came into my head was random generator, but the challenge was how to draw out percentages from a random generator. A lot of research proceeded this thought. Which is how I leaned how to do percentage based random generated numbers. Also it was my first time creating a deque from scratch. I did this by inheriting a linkedlist to the abstract class of deque. Creating the addFirst and addLast methods were pretty easy considering that I was working with LinkedList. Another challenge was creating the same output everytime this preogram was executed. At first I was confused on how to do this because we were working with random generators, but with a little research I learned how to use generator seeds. That gave me the same output each time the program was executed. Overall this was a fun and quick Final Project.

Things That I learned:
.How to create data structures from scratch
.Generator seeds
.Percentage based random generator
.Simulations using Queues and Deques

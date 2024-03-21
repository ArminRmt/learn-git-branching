# Git Branching Exercise

Welcome to the Git Branching Exercise project! This practical exercise is part of the data building course offered in the autumn semester of 1400 at Noshirvani University of Technology, Babol, under the guidance of Dr. Mehdi Emadi.

## Video Overview

Watch a video overview of the project [here](https://github.com/ArminRmt/learn-git-branching/raw/master/video.mp4).

## Introduction

Before diving into the exercise, make sure to watch the [Branching Git Learn](https://example.com) video. This exercise aims to provide hands-on experience in implementing part of a Git tool graphically. Follow the instructions below to get started:

1. Close the tutorial and enter the command `git commit`. Notice how a new vertex is added to the sequence of vertices.
2. Repeat the `git commit` command a few more times to observe the changes.
3. Pay attention to the `*` symbol, which indicates the location of `HEAD`.
4. After committing at least twice, enter the command `git switch c1` to see how the position of the pointer changes.

This graphic tool serves as a simulator and an illustrator, providing a visual representation of Git commands and their effects. If you're new to Git, you can learn more about it and its features [here](https://example.com).

## Practice

In this exercise, your task is to implement the commands `immoc` and `hgitswitchc`. You'll be building a tree where each vertex has a pointer to its parent and a list representing its children.

1. Start by creating a vertex named `0`, which serves as the root and has no parent.
2. Use the command `immoc ig`, to add a vertex to the commit tree. The newly added vertex's parent should be the current `HEAD`.
3. Utilize the command `hgitswitchc` to switch the `HEAD` pointer to a specific vertex number.

Here are some key points to remember:
- Each vertex is named in the format `c`, where `c` indicates the order of addition.
- Every vertex maintains its addition time in timestamp format.
- Each vertex, except the root, has a pointer to its parent.

Let's get started and enhance our understanding of Git branching and version control!

---
**Note:** This project is a simulation and educational exercise aimed at reinforcing concepts related to Git branching and version control.

package org.example.timeplanner.pojo.entity;

public class TaskRelation {
    private int ancestor;
    private int descendant;
    private int depth;

    public int getAncestor() {
        return ancestor;
    }

    public void setAncestor(int ancestor) {
        this.ancestor = ancestor;
    }

    public int getDescendant() {
        return descendant;
    }

    public void setDescendant(int descendant) {
        this.descendant = descendant;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}

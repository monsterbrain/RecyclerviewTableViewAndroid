package com.safecare.recyclerviewtableview;

public class MovieModal {
    private int rank;
    private String movieName;
    private int year;
    private int budgetInMillions;

    public MovieModal(int rank, String movieName, int year, int budgetInMillions) {
        this.rank = rank;
        this.movieName = movieName;
        this.year = year;
        this.budgetInMillions = budgetInMillions;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBudgetInMillions() {
        return budgetInMillions;
    }

    public void setBudgetInMillions(int budgetInMillions) {
        this.budgetInMillions = budgetInMillions;
    }
}

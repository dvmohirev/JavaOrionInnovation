package homework.Task11.task3;

import java.time.LocalDate;

public class Lection {
    private String titleOfLection;
    private LocalDate dateOfLection;

    public Lection(String titleOfLection, LocalDate dateOfLection) {
        this.titleOfLection = titleOfLection;
        this.dateOfLection = dateOfLection;
    }

    public String getTitleOfLection() {
        return titleOfLection;
    }

    public void setTitleOfLection(String titleOfLection) {
        this.titleOfLection = titleOfLection;
    }

    public LocalDate getDateOfLection() {
        return dateOfLection;
    }

    public void setDateOfLection(LocalDate dateOfLection) {
        this.dateOfLection = dateOfLection;
    }
}

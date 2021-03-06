package engine.components.schedule;

import java.time.LocalTime;

public class Daily extends BasicTask {
    private LocalTime scheduledTime;

    public Daily(String title, String description, int duration, LocalTime scheduledTime) {
        super(title, description, duration);
        this.scheduledTime = scheduledTime;
    }

    public LocalTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}

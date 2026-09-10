package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public class TimeConversions {
    public static java.time.Instant convert(Instant instant) {
        if (instant == null) {
            return null;
        }
        return java.time.Instant.ofEpochSecond(instant.C(), instant.J());
    }

    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.J(), duration.C());
    }

    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.V(duration.getSeconds(), duration.getNano());
    }
}

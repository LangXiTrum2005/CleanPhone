package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC4613sq {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUnit f5001a;

    EnumC4613sq(TimeUnit timeUnit) {
        this.f5001a = timeUnit;
    }
}

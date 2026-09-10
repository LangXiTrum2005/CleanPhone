package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3419a;

    public final int a() {
        Configuration configuration = this.f3419a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }
}

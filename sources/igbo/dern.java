package igbo;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: ActivityOptionsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    public static class attabal extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ActivityOptions f28365attabal;

        public attabal(ActivityOptions activityOptions) {
            this.f28365attabal = activityOptions;
        }

        @Override // igbo.dern
        public Bundle saneness() {
            return this.f28365attabal.toBundle();
        }
    }

    public static dern attabal(Context context, int i, int i2) {
        return new attabal(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public Bundle saneness() {
        throw null;
    }
}

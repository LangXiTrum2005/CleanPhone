package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a;
    public final /* synthetic */ Consumer b;
    public final /* synthetic */ Location c;

    public /* synthetic */ d(Consumer consumer, Location location, int i) {
        this.f26a = i;
        this.b = consumer;
        this.c = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f26a;
        Location location = this.c;
        Consumer consumer = this.b;
        switch (i) {
            case 0:
                consumer.accept(location);
                break;
            default:
                consumer.accept(location);
                break;
        }
    }
}

package ads_mobile_sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import saneness.baptize;
import saneness.unprincipled;

/* JADX INFO: loaded from: classes.dex */
public final class cd0 extends ContentObserver {
    public final Handler a;
    public final Context b;
    public final AudioManager c;
    public final unprincipled d;
    public final baptize e;
    public final AtomicReference f;
    public final AtomicBoolean g;
    public final ExecutorService h;

    public cd0(Handler handler, Context context, unprincipled unprincipledVar, ax1 ax1Var) {
        super(handler);
        this.f = new AtomicReference(Float.valueOf(-1.0f));
        this.g = new AtomicBoolean(false);
        this.h = Executors.newSingleThreadExecutor();
        this.a = handler;
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.d = unprincipledVar;
        this.e = ax1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.g.getAndSet(true)) {
            return;
        }
        this.h.submit(new bd0(this));
    }
}

package ads_mobile_sdk;

import http.kowloon;
import java.util.Timer;
import java.util.TimerTask;
import saneness.fastrack;

/* JADX INFO: loaded from: classes.dex */
public final class a91 extends TimerTask {
    public final /* synthetic */ fastrack a;
    public final /* synthetic */ Timer b;
    public final /* synthetic */ d91 c;

    public a91(d91 d91Var, fastrack fastrackVar, Timer timer) {
        this.c = d91Var;
        this.a = fastrackVar;
        this.b = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        kowloon.impassible(this.c.b, "omidJsSessionService");
        this.a.a(true);
        this.b.cancel();
    }
}

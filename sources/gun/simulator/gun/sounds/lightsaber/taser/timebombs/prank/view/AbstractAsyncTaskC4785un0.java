package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.AsyncTask;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.un0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC4785un0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3844k50 f5102a;
    public final C3491g4 b;

    public AbstractAsyncTaskC4785un0(C3491g4 c3491g4) {
        this.b = c3491g4;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C3844k50 c3844k50 = this.f5102a;
        if (c3844k50 != null) {
            c3844k50.e = null;
            c3844k50.a();
        }
    }
}

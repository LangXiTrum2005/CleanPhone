package regius;

import android.content.Context;

/* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman implements saneness {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final saneness.attabal f36230arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f36231kowloon;

    public wireman(Context context, saneness.attabal attabalVar) {
        this.f36231kowloon = context.getApplicationContext();
        this.f36230arytenoidectomy = attabalVar;
    }

    public final void competently() {
        polloi.attabal(this.f36231kowloon).marial(this.f36230arytenoidectomy);
    }

    public final void dern() {
        polloi.attabal(this.f36231kowloon).wireman(this.f36230arytenoidectomy);
    }

    @Override // regius.formularize
    public void onStart() {
        dern();
    }

    @Override // regius.formularize
    public void onStop() {
        competently();
    }

    @Override // regius.formularize
    public void onDestroy() {
    }
}

package outmarry;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: AccessibilityClickableSpanCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends ClickableSpan {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final rotuma f34785arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final int f34786kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f34787monoploid;

    public attabal(int i, rotuma rotumaVar, int i2) {
        this.f34786kowloon = i;
        this.f34785arytenoidectomy = rotumaVar;
        this.f34787monoploid = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f34786kowloon);
        this.f34785arytenoidectomy.treadless(this.f34787monoploid, bundle);
    }
}

package androidx.recyclerview.widget;

import android.support.v4.media.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class LayoutState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8060c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8061e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8063i;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.f8059b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f8060c);
        sb.append(", mItemDirection=");
        sb.append(this.d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f8061e);
        sb.append(", mStartLine=");
        sb.append(this.f);
        sb.append(", mEndLine=");
        return a.p(sb, this.g, AbstractJsonLexerKt.END_OBJ);
    }
}

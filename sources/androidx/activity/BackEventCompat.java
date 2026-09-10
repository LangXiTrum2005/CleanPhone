package androidx.activity;

import android.window.BackEvent;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/BackEventCompat;", "", "Companion", "SwipeEdge", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackEventCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3218c;
    public final int d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/activity/BackEventCompat$Companion;", "", "", "EDGE_LEFT", "I", "EDGE_RIGHT", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Target({ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface SwipeEdge {
    }

    public BackEventCompat(BackEvent backEvent) {
        Intrinsics.f(backEvent, "backEvent");
        Api34Impl api34Impl = Api34Impl.f3215a;
        float fD = api34Impl.d(backEvent);
        float fE = api34Impl.e(backEvent);
        float fB = api34Impl.b(backEvent);
        int iC = api34Impl.c(backEvent);
        this.f3216a = fD;
        this.f3217b = fE;
        this.f3218c = fB;
        this.d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f3216a);
        sb.append(", touchY=");
        sb.append(this.f3217b);
        sb.append(", progress=");
        sb.append(this.f3218c);
        sb.append(", swipeEdge=");
        return android.support.v4.media.a.p(sb, this.d, AbstractJsonLexerKt.END_OBJ);
    }
}

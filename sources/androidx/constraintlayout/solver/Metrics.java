package androidx.constraintlayout.solver;

import android.support.v4.media.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes.dex */
public class Metrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3901c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3902e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3903h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb.append(this.f3899a);
        sb.append("\nmeasuresWrap: 0\nmeasuresWrapInfeasible: 0\ndetermineGroups: 0\ninfeasibleDetermineGroups: 0\ngraphOptimizer: ");
        sb.append(this.f3901c);
        sb.append("\nwidgets: ");
        sb.append(this.f3903h);
        sb.append("\ngraphSolved: ");
        sb.append(this.d);
        sb.append("\nlinearSolved: ");
        return a.j(this.f3902e, IOUtils.LINE_SEPARATOR_UNIX, sb);
    }
}

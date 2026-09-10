package androidx.media3.common.text;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CueGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CueGroup f5613b = new CueGroup(ImmutableList.x());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f5614a;

    static {
        Util.E(0);
        Util.E(1);
    }

    public CueGroup(List list) {
        this.f5614a = ImmutableList.u(list);
    }
}

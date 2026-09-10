package com.p004ironsource;

import android.view.View;
import com.smartdigimkt.h5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ironsource/ax;", "Lcom/ironsource/iq;", "", "e", "", "b", "com/ironsource/ax$b", "d", "Lcom/ironsource/ax$b;", "visibilityChangeListener", "Lcom/ironsource/cx;", "Lcom/ironsource/cx;", "visibilityChangeObserver", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", f.j, "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ax extends iq {
    private static final String g = "ViewVisibilityTrigger";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final b visibilityChangeListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cx visibilityChangeObserver;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/ax$b", "Lcom/ironsource/tp;", "", ch.k, "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements tp {
        public b() {
        }

        @Override // com.p004ironsource.tp
        public void a(boolean isVisible) {
            ax.this.a(!isVisible);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(View view) {
        super(false, 1, null);
        Intrinsics.f(view, "view");
        b bVar = new b();
        this.visibilityChangeListener = bVar;
        cx cxVar = new cx(bVar);
        this.visibilityChangeObserver = cxVar;
        cxVar.a(view);
        a(!cxVar.c());
    }

    @Override // com.p004ironsource.iq
    public String b() {
        return g;
    }

    public final void e() {
        this.visibilityChangeObserver.b();
    }
}

package p008p;

import android.os.Trace;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.a2;
import com.chartboost.sdk.impl.k0;
import com.chartboost.sdk.impl.r2;
import com.chartboost.sdk.impl.vj;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements vj.b, ComponentFactory {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f45280Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f45280Y = obj;
        this.Z = obj2;
    }

    @Override // com.chartboost.sdk.impl.vj.b
    public void a() {
        switch (this.X) {
            case 0:
                a2.a((a2) this.f45280Y, (ShowEvent) this.Z);
                break;
            default:
                k0.a((k0) this.f45280Y, (r2) this.Z);
                break;
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        String str = (String) this.f45280Y;
        Component component = (Component) this.Z;
        try {
            Trace.beginSection(str);
            return component.f.b(componentContainer);
        } finally {
            Trace.endSection();
        }
    }
}

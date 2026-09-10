package com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseIncentiveTaskView extends RelativeLayout {
    com.smartdigimkt.h7.c e0;
    protected c f0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = BaseIncentiveTaskView.this.f0;
            if (cVar != null) {
                cVar.onClose();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public interface c {
        void a();

        void a(int i2);

        void a(long j);

        void onClose();
    }

    public BaseIncentiveTaskView(Context context) {
        this(context, null);
    }

    public abstract void a();

    public void b() {
        com.smartdigimkt.h7.c cVar = this.e0;
        if (cVar != null) {
            cVar.c();
        }
    }

    public void initSetting(f fVar, g gVar, long j, c cVar) {
        this.f0 = cVar;
        com.smartdigimkt.h7.c cVar2 = new com.smartdigimkt.h7.c(gVar.j0(), new a(), true);
        this.e0 = cVar2;
        cVar2.b();
        setOnClickListener(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void onPause() {
        com.smartdigimkt.h7.c cVar = this.e0;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void onResume() {
        com.smartdigimkt.h7.c cVar = this.e0;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void release() {
        b();
    }

    public BaseIncentiveTaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseIncentiveTaskView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }
}

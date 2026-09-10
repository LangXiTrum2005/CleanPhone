package com.bytedance.sdk.openadsdk.core.rq.ud.mml;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.ud.lnr;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends FrameLayout {
    private final C0130qdl lnr;
    private mml mml;
    private final RecyclerView qdl;
    private final List<lnr> ud;

    public static class ud extends RecyclerView.ViewHolder {
        private final ViewGroup qdl;

        public ud(View view) {
            super(view);
            this.qdl = (ViewGroup) view;
        }

        public void qdl(lnr lnrVar) {
            View viewRq = lnrVar.rq();
            ViewParent parent = viewRq.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewRq);
            }
            this.qdl.removeAllViews();
            this.qdl.addView(viewRq, new com.bytedance.adsdk.ugeno.yoga.ud.lnr.qdl(lnrVar.fco(), lnrVar.mrf()));
        }
    }

    public qdl(Context context) {
        super(context);
        this.ud = new CopyOnWriteArrayList();
        C0130qdl c0130qdl = new C0130qdl();
        this.lnr = c0130qdl;
        RecyclerView recyclerView = new RecyclerView(context);
        this.qdl = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0130qdl);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        super.onLayout(z2, i2, i3, i4, i5);
        mml mmlVar2 = this.mml;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i2, i3);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        mml mmlVar2 = this.mml;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.ud(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            RecyclerView recyclerView = this.qdl;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        } else {
            RecyclerView recyclerView2 = this.qdl;
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        }
    }

    public void qdl(lnr<View> lnrVar) {
        if (lnrVar == null) {
            return;
        }
        this.ud.add(lnrVar);
        C0130qdl c0130qdl = this.lnr;
        if (c0130qdl != null) {
            c0130qdl.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.rq.ud.mml.qdl$qdl, reason: collision with other inner class name */
    public class C0130qdl extends RecyclerView.Adapter<ud> {
        private C0130qdl() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return qdl.this.ud.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public ud onCreateViewHolder(ViewGroup viewGroup, int i2) {
            com.bytedance.adsdk.ugeno.yoga.ud.lnr lnrVar = new com.bytedance.adsdk.ugeno.yoga.ud.lnr(viewGroup.getContext());
            lnr lnrVar2 = (lnr) qdl.this.ud.get(i2);
            lnrVar.setLayoutParams(new ViewGroup.LayoutParams(lnrVar2.fco(), lnrVar2.mrf()));
            return new ud(lnrVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(ud udVar, int i2) {
            udVar.qdl((lnr) qdl.this.ud.get(i2));
        }
    }

    public void qdl(mml mmlVar) {
        this.mml = mmlVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.rq.ud.mml.ud udVar) {
        ViewGroup.LayoutParams layoutParams = this.qdl.getLayoutParams();
        layoutParams.width = udVar.fco();
        layoutParams.height = udVar.mrf();
        this.qdl.setLayoutParams(layoutParams);
    }
}

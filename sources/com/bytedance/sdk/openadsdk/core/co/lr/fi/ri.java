package com.bytedance.sdk.openadsdk.core.co.lr.fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.ka;
import com.bytedance.adsdk.ugeno.lr.ik;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends FrameLayout {
    private final C0244ri ik;
    private ka ka;
    private final List<ik> lr;
    private final RecyclerView ri;

    public static class lr extends RecyclerView.stratoscope {
        private final ViewGroup ri;

        public lr(View view) {
            super(view);
            this.ri = (ViewGroup) view;
        }

        public void ri(ik ikVar) {
            View viewSf = ikVar.sf();
            ViewParent parent = viewSf.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewSf);
            }
            this.ri.removeAllViews();
            this.ri.addView(viewSf, new com.bytedance.adsdk.ugeno.yoga.lr.ik.ri(ikVar.pv(), ikVar.ig()));
        }
    }

    public ri(Context context) {
        super(context);
        this.lr = new CopyOnWriteArrayList();
        C0244ri c0244ri = new C0244ri();
        this.ik = c0244ri;
        RecyclerView recyclerView = new RecyclerView(context);
        this.ri = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0244ri);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka kaVar = this.ka;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ka kaVar = this.ka;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ka kaVar = this.ka;
        if (kaVar != null) {
            kaVar.di();
        }
        super.onLayout(z, i, i2, i3, i4);
        ka kaVar2 = this.ka;
        if (kaVar2 != null) {
            kaVar2.ri(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ka kaVar = this.ka;
        if (kaVar != null) {
            int[] iArrRi = kaVar.ri(i, i2);
            super.onMeasure(iArrRi[0], iArrRi[1]);
        } else {
            super.onMeasure(i, i2);
        }
        ka kaVar2 = this.ka;
        if (kaVar2 != null) {
            kaVar2.fi();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ka kaVar = this.ka;
        if (kaVar != null) {
            kaVar.lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setOrientation(int i) {
        if (i == 1) {
            this.ri.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.ri.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }

    public void ri(ik<View> ikVar) {
        if (ikVar == null) {
            return;
        }
        this.lr.add(ikVar);
        C0244ri c0244ri = this.ik;
        if (c0244ri != null) {
            c0244ri.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.fi.ri$ri, reason: collision with other inner class name */
    public class C0244ri extends RecyclerView.Adapter<lr> {
        private C0244ri() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ri.this.lr.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public lr onCreateViewHolder(ViewGroup viewGroup, int i) {
            com.bytedance.adsdk.ugeno.yoga.lr.ik ikVar = new com.bytedance.adsdk.ugeno.yoga.lr.ik(viewGroup.getContext());
            ik ikVar2 = (ik) ri.this.lr.get(i);
            ikVar.setLayoutParams(new ViewGroup.LayoutParams(ikVar2.pv(), ikVar2.ig()));
            return new lr(ikVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(lr lrVar, int i) {
            lrVar.ri((ik) ri.this.lr.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i;
        }
    }

    public void ri(ka kaVar) {
        this.ka = kaVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.co.lr.fi.lr lrVar) {
        ViewGroup.LayoutParams layoutParams = this.ri.getLayoutParams();
        layoutParams.width = lrVar.pv();
        layoutParams.height = lrVar.ig();
        this.ri.setLayoutParams(layoutParams);
    }
}

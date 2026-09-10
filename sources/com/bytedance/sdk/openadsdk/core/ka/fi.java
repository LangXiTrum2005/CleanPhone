package com.bytedance.sdk.openadsdk.core.ka;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.uq;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private final di.lr di;
    private di lr;
    private final di.ri mj;
    private uq ri;
    private final View.OnAttachStateChangeListener xha;
    private List<ri> ik = new ArrayList();
    private final String ka = "BannerSwiperManager";
    private int fi = -1;

    public fi(uq uqVar, Context context, int i, int i2) {
        di.lr lrVar = new di.lr() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.1
            @Override // com.bytedance.sdk.openadsdk.core.ka.di.lr
            public void ri(boolean z) {
                try {
                    if (z) {
                        fi.this.ka();
                    } else {
                        fi.this.ik();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.di = lrVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                fi.this.fi();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (fi.this.ik != null && !fi.this.ik.isEmpty()) {
                    for (int i3 = 0; i3 < fi.this.ik.size(); i3++) {
                        ((ri) fi.this.ik.get(i3)).di();
                    }
                }
                fi.this.fi = -1;
                if (fi.this.lr != null) {
                    fi.this.lr.ka();
                }
            }
        };
        this.xha = onAttachStateChangeListener;
        di.ri riVar = new di.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.3
            @Override // com.bytedance.sdk.openadsdk.core.ka.di.ri
            public void ri(boolean z) {
                if (z) {
                    fi.this.ka();
                } else {
                    fi.this.ik();
                }
            }
        };
        this.mj = riVar;
        this.ri = uqVar;
        di diVar = new di(context);
        this.lr = diVar;
        diVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.lr.setSwiperWindowFocusChangedListener(lrVar);
        this.lr.setSwiperVisibleChangeListener(riVar);
        ri(context, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void fi() {
        if (this.ri == null) {
            this.ri = new uq();
        }
        this.lr.ri(TextUtils.equals(this.ri.ri(), "vertical") ? 1 : 0).ri("dot").ik(false).ka(this.ri.ka() == 1).ri(this.ri.lr() == 1).ik(this.ri.jbs()).fi(this.ri.qt() == 1).ka(this.ri.mj()).lr(this.ri.ik() == 1).mj(this.ri.fi()).jbs(this.ri.di()).xha(this.ri.xha());
        this.lr.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.di.ik() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.4
            @Override // com.bytedance.adsdk.ugeno.di.ik
            public void ri(boolean z, int i, float f, int i2) {
            }

            @Override // com.bytedance.adsdk.ugeno.di.ik
            public void ri(boolean z, int i, int i2, boolean z2, boolean z3) {
                fi.this.ik(i);
                fi.this.fi = i;
                fi.this.ri(i);
                fi.this.lr(i);
            }

            @Override // com.bytedance.adsdk.ugeno.di.ik
            public void ri(boolean z, int i) {
                if (i == 1 || i == 2) {
                    fi.this.lr(-1);
                } else if (i == 0) {
                    fi fiVar = fi.this;
                    fiVar.ri(fiVar.fi);
                }
            }
        });
        lr(this.ik);
        this.lr.ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik() {
        di diVar;
        uq uqVar = this.ri;
        if (uqVar != null && uqVar.lr() == 1 && (diVar = this.lr) != null) {
            diVar.di();
        }
        if (this.fi >= 0) {
            lr(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka() {
        di diVar;
        uq uqVar = this.ri;
        if (uqVar != null && uqVar.lr() == 1 && (diVar = this.lr) != null) {
            diVar.fi();
        }
        int i = this.fi;
        if (i >= 0) {
            ri(i);
            lr(this.fi);
        }
    }

    public void lr(int i) {
        ri riVar;
        for (int i2 = 0; i2 < this.ik.size(); i2++) {
            try {
                if (i2 != i && (riVar = this.ik.get(i2)) != null) {
                    riVar.jbs();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
    }

    public void ri(Context context, float f, float f2) {
        int iLr = qd.lr(context, f);
        int iLr2 = qd.lr(context, f2);
        ViewGroup.LayoutParams layoutParams = this.lr.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iLr, iLr2);
        }
        layoutParams.width = iLr;
        layoutParams.height = iLr2;
        this.lr.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(int i) {
        ri riVar;
        try {
            int i2 = this.fi;
            if (i2 != -1 && i2 != i && (riVar = this.ik.get(i2)) != null) {
                riVar.ka();
                riVar.mj();
            }
            ri riVar2 = this.ik.get(i);
            if (riVar2 != null) {
                riVar2.fi();
            }
        } catch (Throwable unused) {
        }
    }

    private void lr(List<ri> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            this.lr.ri(list.get(i).ri());
        }
    }

    public View lr() {
        return this.lr;
    }

    public void ri(List<ri> list) {
        this.ik = list;
    }

    public void ri(final int i) {
        ri riVar;
        try {
            final int size = this.ik.size();
            if (i < size && (riVar = this.ik.get(i)) != null) {
                riVar.ri(new com.bytedance.sdk.openadsdk.ri.ri.lr() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.5
                    @Override // com.bytedance.sdk.openadsdk.ri.ri.lr
                    public void ri() {
                        int i2 = i + 1;
                        if (i2 >= size) {
                            return;
                        }
                        fi.this.ri(i2);
                    }
                });
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void ri() {
        if (this.lr != null) {
            try {
                List<ri> list = this.ik;
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < this.ik.size(); i++) {
                        this.ik.get(i).xha();
                    }
                }
                this.fi = -1;
                this.lr.ka();
                this.lr.setSwiperWindowFocusChangedListener(null);
                this.lr.setSwiperVisibleChangeListener(null);
                this.lr.removeOnAttachStateChangeListener(this.xha);
                this.lr = null;
            } catch (Throwable unused) {
            }
        }
    }
}

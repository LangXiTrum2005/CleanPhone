package sg.bigo.ads.ad.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f45675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f45676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f45677c;
    public f.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f45678e;
    boolean f;

    public final void a() {
        n nVar = this.f45678e;
        if (nVar != null) {
            nVar.b();
            this.f = false;
        }
    }

    public final void a(ViewGroup viewGroup, int i2, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        this.f = false;
        this.d = aVar;
        this.f45677c = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_close_btn);
        this.f45675a = (TextView) viewGroup.findViewById(R.id.close_text);
        TextView textView = (TextView) viewGroup.findViewById(R.id.second_text);
        this.f45676b = textView;
        ViewGroup viewGroup2 = this.f45677c;
        if (viewGroup2 == null || this.f45675a == null || textView == null) {
            f.a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.d_();
                return;
            }
            return;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.d.d.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.a aVar3 = d.this.d;
                if (aVar3 != null) {
                    aVar3.d_();
                }
            }
        });
        this.f45677c.setClickable(false);
        this.f45675a.setTextColor(1728053247);
        this.f45676b.setVisibility(0);
        n nVar = new n(((long) i2) * 1000) { // from class: sg.bigo.ads.ad.d.d.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                d dVar = d.this;
                dVar.f = true;
                dVar.f45677c.setAlpha(1.0f);
                d.this.f45677c.setClickable(true);
                d.this.f45676b.setVisibility(8);
                d.this.f45675a.setTextColor(-1);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j) {
                d.this.f45676b.setText(q.a("%ds", Integer.valueOf(Math.round(j / 1000.0f))));
            }
        };
        this.f45678e = nVar;
        nVar.c();
    }
}

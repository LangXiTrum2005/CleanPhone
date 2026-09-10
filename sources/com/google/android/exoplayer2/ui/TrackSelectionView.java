package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5011xP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2783Tn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3974ld0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4501rd0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4765ud0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5029xd0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ET;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4150nd0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f811a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final ET e;
    public final ArrayList f;
    public final HashMap g;
    public boolean h;
    public boolean i;
    public InterfaceC4150nd0 j;
    public CheckedTextView[][] k;
    public boolean l;

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f811a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.b = layoutInflaterFrom;
        ET et = new ET(this);
        this.e = et;
        this.j = new C2783Tn(getResources());
        this.f = new ArrayList();
        this.g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(et);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(et);
        addView(checkedTextView2);
    }

    public final void a() {
        this.c.setChecked(this.l);
        boolean z = this.l;
        HashMap map = this.g;
        this.d.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.k.length; i++) {
            C4501rd0 c4501rd0 = (C4501rd0) map.get(((C5029xd0) this.f.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (c4501rd0 != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.k[i][i2].setChecked(c4501rd0.b.contains(Integer.valueOf(((C4765ud0) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    public final void b() {
        String strA;
        String string;
        int i;
        int i2;
        String string2;
        char c;
        int i3 = -1;
        boolean z = false;
        int i4 = 1;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.d;
        CheckedTextView checkedTextView2 = this.c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.k = new CheckedTextView[arrayList.size()][];
        boolean z2 = this.i && arrayList.size() > 1;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            C5029xd0 c5029xd0 = (C5029xd0) arrayList.get(i5);
            boolean z3 = this.h && c5029xd0.c;
            CheckedTextView[][] checkedTextViewArr = this.k;
            int i6 = c5029xd0.f5234a;
            checkedTextViewArr[i5] = new CheckedTextView[i6];
            C4765ud0[] c4765ud0Arr = new C4765ud0[i6];
            for (int i7 = 0; i7 < c5029xd0.f5234a; i7 += i4) {
                c4765ud0Arr[i7] = new C4765ud0(c5029xd0, i7);
            }
            int i8 = 0;
            while (i8 < i6) {
                LayoutInflater layoutInflater = this.b;
                if (i8 == 0) {
                    addView(layoutInflater.inflate(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.layout.exo_list_divider, this, z));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z3 || z2) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, this, z);
                checkedTextView3.setBackgroundResource(this.f811a);
                InterfaceC4150nd0 interfaceC4150nd0 = this.j;
                C4765ud0 c4765ud0 = c4765ud0Arr[i8];
                C4619sw c4619sw = c4765ud0.f5089a.b.d[c4765ud0.b];
                C2783Tn c2783Tn = (C2783Tn) interfaceC4150nd0;
                c2783Tn.getClass();
                int i9 = AbstractC5011xP.i(c4619sw.l);
                int i10 = c4619sw.y;
                int i11 = c4619sw.r;
                ArrayList arrayList2 = arrayList;
                int i12 = c4619sw.q;
                if (i9 == i3) {
                    String str = c4619sw.i;
                    if (AbstractC5011xP.j(str) != null) {
                        i9 = 2;
                    } else if (AbstractC5011xP.b(str) != null) {
                        i9 = 1;
                    } else if (i12 != i3 || i11 != i3) {
                        i9 = 2;
                    } else if (i10 == i3 && c4619sw.z == i3) {
                        i9 = -1;
                    } else {
                        i9 = 1;
                    }
                }
                String string3 = "";
                Resources resources = c2783Tn.f3793a;
                boolean z4 = z2;
                int i13 = c4619sw.h;
                boolean z5 = z3;
                if (i9 == 2) {
                    String[] strArr = new String[3];
                    strArr[0] = c2783Tn.b(c4619sw);
                    if (i12 == -1 || i11 == -1) {
                        i2 = 1;
                        string2 = "";
                    } else {
                        i2 = 1;
                        string2 = resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_resolution, Integer.valueOf(i12), Integer.valueOf(i11));
                    }
                    strArr[i2] = string2;
                    if (i13 == -1) {
                        c = 2;
                    } else {
                        Object[] objArr = new Object[i2];
                        objArr[0] = Float.valueOf(i13 / 1000000.0f);
                        string3 = resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_bitrate, objArr);
                        c = 2;
                    }
                    strArr[c] = string3;
                    strA = c2783Tn.c(strArr);
                } else if (i9 == 1) {
                    String[] strArr2 = new String[3];
                    strArr2[0] = c2783Tn.a(c4619sw);
                    if (i10 == -1 || i10 < 1) {
                        string = "";
                    } else if (i10 == 1) {
                        string = resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_mono);
                    } else if (i10 == 2) {
                        string = resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_stereo);
                    } else if (i10 == 6 || i10 == 7) {
                        string = resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_surround_5_point_1);
                    } else {
                        string = i10 != 8 ? resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_surround) : resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_surround_7_point_1);
                    }
                    strArr2[1] = string;
                    strArr2[2] = i13 != -1 ? resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_bitrate, Float.valueOf(i13 / 1000000.0f)) : "";
                    strA = c2783Tn.c(strArr2);
                } else {
                    strA = c2783Tn.a(c4619sw);
                }
                if (strA.length() == 0) {
                    strA = resources.getString(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R.string.exo_track_unknown);
                }
                checkedTextView3.setText(strA);
                checkedTextView3.setTag(c4765ud0Arr[i8]);
                if (c5029xd0.d[i8] != 4) {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                    i = 1;
                } else {
                    i = 1;
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.e);
                }
                this.k[i5][i8] = checkedTextView3;
                addView(checkedTextView3);
                i8 += i;
                arrayList = arrayList2;
                z2 = z4;
                z3 = z5;
                i3 = -1;
                z = false;
            }
            i5++;
            arrayList = arrayList;
            i3 = -1;
            z = false;
            i4 = 1;
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map<C3974ld0, C4501rd0> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.h != z) {
            this.h = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z) {
                HashMap map = this.g;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f;
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        C4501rd0 c4501rd0 = (C4501rd0) map.get(((C5029xd0) arrayList.get(i)).b);
                        if (c4501rd0 != null && map2.isEmpty()) {
                            map2.put(c4501rd0.f4938a, c4501rd0);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC4150nd0 interfaceC4150nd0) {
        interfaceC4150nd0.getClass();
        this.j = interfaceC4150nd0;
        b();
    }
}

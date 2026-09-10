package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.Tracks;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final int e0;
    public final LayoutInflater f0;
    public final CheckedTextView g0;
    public final CheckedTextView h0;
    public final ComponentListener i0;
    public final ArrayList j0;
    public final HashMap k0;
    public boolean l0;
    public boolean m0;
    public TrackNameProvider n0;
    public CheckedTextView[][] o0;
    public boolean p0;

    public class ComponentListener implements View.OnClickListener {
        public ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            HashMap map = trackSelectionView.k0;
            boolean z2 = true;
            if (view == trackSelectionView.g0) {
                trackSelectionView.p0 = true;
                map.clear();
            } else if (view == trackSelectionView.h0) {
                trackSelectionView.p0 = false;
                map.clear();
            } else {
                trackSelectionView.p0 = false;
                Object tag = view.getTag();
                tag.getClass();
                TrackInfo trackInfo = (TrackInfo) tag;
                Tracks.Group group = trackInfo.f7749a;
                TrackGroup trackGroup = group.f5549b;
                TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(trackGroup);
                int i2 = trackInfo.f7750b;
                if (trackSelectionOverride == null) {
                    if (!trackSelectionView.m0 && map.size() > 0) {
                        map.clear();
                    }
                    map.put(trackGroup, new TrackSelectionOverride(trackGroup, ImmutableList.z(Integer.valueOf(i2))));
                } else {
                    ArrayList arrayList = new ArrayList(trackSelectionOverride.f5526b);
                    boolean zIsChecked = ((CheckedTextView) view).isChecked();
                    boolean z3 = trackSelectionView.l0 && group.f5550c;
                    if (!z3 && (!trackSelectionView.m0 || trackSelectionView.j0.size() <= 1)) {
                        z2 = false;
                    }
                    if (zIsChecked && z2) {
                        arrayList.remove(Integer.valueOf(i2));
                        if (arrayList.isEmpty()) {
                            map.remove(trackGroup);
                        } else {
                            map.put(trackGroup, new TrackSelectionOverride(trackGroup, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z3) {
                            arrayList.add(Integer.valueOf(i2));
                            map.put(trackGroup, new TrackSelectionOverride(trackGroup, arrayList));
                        } else {
                            map.put(trackGroup, new TrackSelectionOverride(trackGroup, ImmutableList.z(Integer.valueOf(i2))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    public static final class TrackInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Tracks.Group f7749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7750b;

        public TrackInfo(Tracks.Group group, int i2) {
            this.f7749a = group;
            this.f7750b = i2;
        }
    }

    public interface TrackSelectionListener {
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.e0 = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f0 = layoutInflaterFrom;
        ComponentListener componentListener = new ComponentListener();
        this.i0 = componentListener;
        this.n0 = new DefaultTrackNameProvider(getResources());
        this.j0 = new ArrayList();
        this.k0 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.g0 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.charging.screenshow.battery.animations.themes.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.charging.screenshow.battery.animations.themes.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.h0 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.charging.screenshow.battery.animations.themes.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }

    public final void a() {
        this.g0.setChecked(this.p0);
        boolean z2 = this.p0;
        HashMap map = this.k0;
        this.h0.setChecked(!z2 && map.size() == 0);
        for (int i2 = 0; i2 < this.o0.length; i2++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(((Tracks.Group) this.j0.get(i2)).f5549b);
            int i3 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.o0[i2];
                if (i3 < checkedTextViewArr.length) {
                    if (trackSelectionOverride != null) {
                        Object tag = checkedTextViewArr[i3].getTag();
                        tag.getClass();
                        this.o0[i2][i3].setChecked(trackSelectionOverride.f5526b.contains(Integer.valueOf(((TrackInfo) tag).f7750b)));
                    } else {
                        checkedTextViewArr[i3].setChecked(false);
                    }
                    i3++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.j0;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.h0;
        CheckedTextView checkedTextView2 = this.g0;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.o0 = new CheckedTextView[arrayList.size()][];
        boolean z2 = this.m0 && arrayList.size() > 1;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Tracks.Group group = (Tracks.Group) arrayList.get(i2);
            boolean z3 = this.l0 && group.f5550c;
            CheckedTextView[][] checkedTextViewArr = this.o0;
            int i3 = group.f5548a;
            checkedTextViewArr[i2] = new CheckedTextView[i3];
            TrackInfo[] trackInfoArr = new TrackInfo[i3];
            for (int i4 = 0; i4 < group.f5548a; i4++) {
                trackInfoArr[i4] = new TrackInfo(group, i4);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                LayoutInflater layoutInflater = this.f0;
                if (i5 == 0) {
                    addView(layoutInflater.inflate(com.charging.screenshow.battery.animations.themes.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z3 || z2) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.e0);
                TrackNameProvider trackNameProvider = this.n0;
                TrackInfo trackInfo = trackInfoArr[i5];
                checkedTextView3.setText(trackNameProvider.a(trackInfo.f7749a.a(trackInfo.f7750b)));
                checkedTextView3.setTag(trackInfoArr[i5]);
                if (group.b(i5)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.i0);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.o0[i2][i5] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.p0;
    }

    public Map<TrackGroup, TrackSelectionOverride> getOverrides() {
        return this.k0;
    }

    public void setAllowAdaptiveSelections(boolean z2) {
        if (this.l0 != z2) {
            this.l0 = z2;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z2) {
        if (this.m0 != z2) {
            this.m0 = z2;
            if (!z2) {
                HashMap map = this.k0;
                if (map.size() > 1) {
                    ArrayList arrayList = this.j0;
                    HashMap map2 = new HashMap();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(((Tracks.Group) arrayList.get(i2)).f5549b);
                        if (trackSelectionOverride != null && map2.isEmpty()) {
                            map2.put(trackSelectionOverride.f5525a, trackSelectionOverride);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z2) {
        this.g0.setVisibility(z2 ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        trackNameProvider.getClass();
        this.n0 = trackNameProvider;
        b();
    }
}

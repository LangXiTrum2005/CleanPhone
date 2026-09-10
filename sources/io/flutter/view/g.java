package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f43478y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.i f43480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f43481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f43482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f43483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f43484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f43485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f43486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f43487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f43488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f43489k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f43490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f43491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f43492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f43493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f43494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f43495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s4.i f43496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f43497t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f43498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f43499v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f43500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.gms.internal.auth.k f43501x;

    public g(View view, qd.i iVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f43485g = new HashMap();
        this.f43486h = new HashMap();
        this.l = 0;
        this.f43494q = new ArrayList();
        this.f43495r = 0;
        this.f43497t = false;
        this.f43498u = false;
        a aVar = new a(this);
        b bVar = new b(this);
        this.f43499v = bVar;
        com.google.android.gms.internal.auth.k kVar = new com.google.android.gms.internal.auth.k(this, new Handler(), 1);
        this.f43501x = kVar;
        this.f43479a = view;
        this.f43480b = iVar;
        this.f43481c = accessibilityManager;
        this.f43484f = contentResolver;
        this.f43482d = accessibilityViewEmbedder;
        this.f43483e = hVar;
        iVar.f48982d = aVar;
        ((FlutterJNI) iVar.f48981c).setAccessibilityDelegate(aVar);
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        c cVar = new c(this, accessibilityManager);
        this.f43500w = cVar;
        cVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        this.l |= 128;
        kVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, kVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i10 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i10 == Integer.MAX_VALUE || i10 < 300) {
                this.l &= -9;
            } else {
                this.l |= 8;
            }
            ((FlutterJNI) iVar.f48981c).setAccessibilityFeatures(this.l);
        }
        hVar.d(this);
    }

    public static String d(ByteBuffer byteBuffer, String[] strArr) {
        int i10 = byteBuffer.getInt();
        if (i10 == -1) {
            return null;
        }
        return strArr[i10];
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f43482d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f43489k = recordFlutterId;
            this.f43491n = null;
            return true;
        }
        if (eventType == 128) {
            this.f43493p = null;
            return true;
        }
        if (eventType == 32768) {
            this.f43488j = recordFlutterId;
            this.f43487i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f43489k = null;
        this.f43488j = null;
        return true;
    }

    public final e b(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f43486h;
        e eVar = (e) map.get(numValueOf);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f43447c = -1;
        eVar2.f43446b = i10;
        eVar2.f43445a = 267386881 + i10;
        map.put(Integer.valueOf(i10), eVar2);
        return eVar2;
    }

    public final f c(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f43485g;
        f fVar = (f) map.get(numValueOf);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        fVar2.f43452b = i10;
        map.put(Integer.valueOf(i10), fVar2);
        return fVar2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        boolean zG;
        CharSequence charSequenceB;
        int i11;
        int i12;
        j(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f43482d;
        if (i10 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i10);
        }
        HashMap map = this.f43485g;
        View view = this.f43479a;
        if (i10 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            return accessibilityNodeInfoObtain;
        }
        f fVar = (f) map.get(Integer.valueOf(i10));
        if (fVar != null) {
            int i13 = fVar.f43461i;
            io.flutter.plugin.platform.h hVar = this.f43483e;
            if (i13 == -1 || !hVar.t0(i13)) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i10);
                accessibilityNodeInfoObtain2.setImportantForAccessibility((fVar.g(12) || (f.b(fVar) == null && fVar.f43456d == 0)) ? false : true);
                accessibilityNodeInfoObtain2.setViewIdResourceName("");
                String str = fVar.f43466o;
                if (str != null) {
                    accessibilityNodeInfoObtain2.setViewIdResourceName(str);
                }
                accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
                accessibilityNodeInfoObtain2.setClassName("android.view.View");
                accessibilityNodeInfoObtain2.setSource(view, i10);
                accessibilityNodeInfoObtain2.setFocusable(fVar.i());
                f fVar2 = this.f43491n;
                if (fVar2 != null) {
                    accessibilityNodeInfoObtain2.setFocused(fVar2.f43452b == i10);
                }
                f fVar3 = this.f43487i;
                if (fVar3 != null) {
                    accessibilityNodeInfoObtain2.setAccessibilityFocused(fVar3.f43452b == i10);
                }
                if (fVar.g(5)) {
                    accessibilityNodeInfoObtain2.setPassword(fVar.g(11));
                    if (!fVar.g(21)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
                    }
                    accessibilityNodeInfoObtain2.setEditable(!fVar.g(21));
                    int i14 = fVar.f43459g;
                    if (i14 != -1 && (i12 = fVar.f43460h) != -1) {
                        accessibilityNodeInfoObtain2.setTextSelection(i14, i12);
                    }
                    f fVar4 = this.f43487i;
                    if (fVar4 != null && fVar4.f43452b == i10) {
                        accessibilityNodeInfoObtain2.setLiveRegion(1);
                    }
                    if (f.a(fVar, d.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                        accessibilityNodeInfoObtain2.addAction(NotificationCompat.FLAG_LOCAL_ONLY);
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (f.a(fVar, d.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i11 = 1;
                    }
                    if (f.a(fVar, d.MOVE_CURSOR_FORWARD_BY_WORD)) {
                        accessibilityNodeInfoObtain2.addAction(NotificationCompat.FLAG_LOCAL_ONLY);
                        i11 |= 2;
                    }
                    if (f.a(fVar, d.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i11 |= 2;
                    }
                    accessibilityNodeInfoObtain2.setMovementGranularities(i11);
                    if (fVar.f43457e >= 0) {
                        String str2 = fVar.f43469r;
                        accessibilityNodeInfoObtain2.setMaxTextLength(((str2 == null ? 0 : str2.length()) - fVar.f43458f) + fVar.f43457e);
                    }
                }
                if (f.a(fVar, d.SET_SELECTION)) {
                    accessibilityNodeInfoObtain2.addAction(131072);
                }
                if (f.a(fVar, d.COPY)) {
                    accessibilityNodeInfoObtain2.addAction(Http2.INITIAL_MAX_FRAME_SIZE);
                }
                if (f.a(fVar, d.CUT)) {
                    accessibilityNodeInfoObtain2.addAction(C.DEFAULT_BUFFER_SEGMENT_SIZE);
                }
                if (f.a(fVar, d.PASTE)) {
                    accessibilityNodeInfoObtain2.addAction(32768);
                }
                if (f.a(fVar, d.SET_TEXT)) {
                    accessibilityNodeInfoObtain2.addAction(2097152);
                }
                if (fVar.g(4)) {
                    zG = true;
                } else {
                    String str3 = fVar.A;
                    zG = (str3 == null || str3.isEmpty()) ? fVar.g(23) : false;
                }
                if (zG) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
                }
                if (fVar.g(15)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
                }
                if (f.a(fVar, d.DISMISS)) {
                    accessibilityNodeInfoObtain2.setDismissable(true);
                    accessibilityNodeInfoObtain2.addAction(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                }
                f fVar5 = fVar.S;
                if (fVar5 != null) {
                    accessibilityNodeInfoObtain2.setParent(view, fVar5.f43452b);
                } else {
                    accessibilityNodeInfoObtain2.setParent(view);
                }
                int i15 = fVar.D;
                if (i15 != -1) {
                    accessibilityNodeInfoObtain2.setTraversalAfter(view, i15);
                }
                Rect rect = fVar.f43455c0;
                f fVar6 = fVar.S;
                if (fVar6 != null) {
                    Rect rect2 = fVar6.f43455c0;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
                } else {
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect);
                }
                Rect rect4 = new Rect(rect);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect4.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
                accessibilityNodeInfoObtain2.setVisibleToUser(true);
                accessibilityNodeInfoObtain2.setEnabled(!fVar.g(7) || fVar.g(8));
                if (f.a(fVar, d.TAP)) {
                    if (fVar.W != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, fVar.W.f43449e));
                        accessibilityNodeInfoObtain2.setClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(16);
                        accessibilityNodeInfoObtain2.setClickable(true);
                    }
                } else if (fVar.g(24)) {
                    accessibilityNodeInfoObtain2.addAction(16);
                    accessibilityNodeInfoObtain2.setClickable(true);
                }
                if (f.a(fVar, d.LONG_PRESS)) {
                    if (fVar.X != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, fVar.X.f43449e));
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(32);
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    }
                }
                d dVar = d.SCROLL_LEFT;
                boolean zA = f.a(fVar, dVar);
                d dVar2 = d.SCROLL_DOWN;
                d dVar3 = d.SCROLL_UP;
                d dVar4 = d.SCROLL_RIGHT;
                if (zA || f.a(fVar, dVar3) || f.a(fVar, dVar4) || f.a(fVar, dVar2)) {
                    accessibilityNodeInfoObtain2.setScrollable(true);
                    if (fVar.g(19)) {
                        if (f.a(fVar, dVar) || f.a(fVar, dVar4)) {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (k(fVar)) {
                    if (f.a(fVar, dVar) || f.a(fVar, dVar4)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, fVar.f43462j, false));
                        } else {
                            accessibilityNodeInfoObtain2.setCollectionInfo(new AccessibilityNodeInfo.CollectionInfo(1, fVar.f43462j, false));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(fVar.f43462j, 1, false));
                    } else {
                        accessibilityNodeInfoObtain2.setCollectionInfo(new AccessibilityNodeInfo.CollectionInfo(fVar.f43462j, 1, false));
                    }
                }
                f fVar7 = fVar.S;
                if (fVar7 != null && k(fVar7) && fVar.S.g(19)) {
                    f fVar8 = fVar.S;
                    ArrayList arrayList = fVar8.T;
                    boolean z10 = (f.a(fVar8, dVar) || f.a(fVar8, dVar4)) ? false : true;
                    int iIndexOf = arrayList.indexOf(fVar);
                    if (z10) {
                        if (Build.VERSION.SDK_INT < 33) {
                            accessibilityNodeInfoObtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iIndexOf, 1, 0, 1, fVar.g(10)));
                        } else {
                            accessibilityNodeInfoObtain2.setCollectionItemInfo(new AccessibilityNodeInfo.CollectionItemInfo(iIndexOf, 1, 0, 1, fVar.g(10)));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        accessibilityNodeInfoObtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIndexOf, 1, fVar.g(10)));
                    } else {
                        accessibilityNodeInfoObtain2.setCollectionItemInfo(new AccessibilityNodeInfo.CollectionItemInfo(0, 1, iIndexOf, 1, fVar.g(10)));
                    }
                }
                if (f.a(fVar, dVar) || f.a(fVar, dVar3)) {
                    accessibilityNodeInfoObtain2.addAction(4096);
                }
                if (f.a(fVar, dVar4) || f.a(fVar, dVar2)) {
                    accessibilityNodeInfoObtain2.addAction(Segment.SIZE);
                }
                d dVar5 = d.INCREASE;
                boolean zA2 = f.a(fVar, dVar5);
                d dVar6 = d.DECREASE;
                if (zA2 || f.a(fVar, dVar6)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
                    if (f.a(fVar, dVar5)) {
                        accessibilityNodeInfoObtain2.addAction(4096);
                    }
                    if (f.a(fVar, dVar6)) {
                        accessibilityNodeInfoObtain2.addAction(Segment.SIZE);
                    }
                }
                if (fVar.g(16)) {
                    accessibilityNodeInfoObtain2.setLiveRegion(1);
                }
                if (fVar.g(5)) {
                    k5.g gVar = new k5.g();
                    gVar.f44325a = fVar.f43469r;
                    gVar.f44326b = fVar.f43470s;
                    gVar.f44327c = fVar.d();
                    accessibilityNodeInfoObtain2.setText(gVar.c());
                    k5.g gVar2 = new k5.g();
                    gVar2.f44325a = fVar.f43467p;
                    gVar2.f44326b = fVar.f43468q;
                    gVar2.f44328d = fVar.A;
                    gVar2.f44327c = fVar.d();
                    SpannableString spannableStringC = gVar2.c();
                    k5.g gVar3 = new k5.g();
                    gVar3.f44325a = fVar.f43475x;
                    gVar3.f44326b = fVar.f43476y;
                    gVar3.f44327c = fVar.d();
                    CharSequence[] charSequenceArr = {spannableStringC, gVar3.c()};
                    int i16 = 0;
                    CharSequence charSequenceConcat = null;
                    for (int i17 = 2; i16 < i17; i17 = 2) {
                        CharSequence charSequence = charSequenceArr[i16];
                        if (charSequence != null && charSequence.length() > 0) {
                            charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                        }
                        i16++;
                    }
                    accessibilityNodeInfoObtain2.setHintText(charSequenceConcat);
                } else if (!fVar.g(12) && (charSequenceB = f.b(fVar)) != null) {
                    accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
                }
                int i18 = Build.VERSION.SDK_INT;
                String str4 = fVar.f43477z;
                if (str4 != null) {
                    accessibilityNodeInfoObtain2.setTooltipText(str4);
                    if (f.b(fVar) == null) {
                        accessibilityNodeInfoObtain2.setContentDescription(fVar.f43477z);
                    }
                }
                boolean zG2 = fVar.g(1);
                boolean zG3 = fVar.g(17);
                accessibilityNodeInfoObtain2.setCheckable(zG2 || zG3);
                if (zG2) {
                    accessibilityNodeInfoObtain2.setChecked(fVar.g(2));
                    if (fVar.g(9)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
                    }
                } else if (zG3) {
                    accessibilityNodeInfoObtain2.setChecked(fVar.g(18));
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
                }
                accessibilityNodeInfoObtain2.setSelected(fVar.g(3));
                if (i18 >= 36 && fVar.g(27)) {
                    accessibilityNodeInfoObtain2.setExpandedState(fVar.g(28) ? 3 : 1);
                    if (f.a(fVar, d.EXPAND)) {
                        accessibilityNodeInfoObtain2.addAction(262144);
                    }
                    if (f.a(fVar, d.COLLAPSE)) {
                        accessibilityNodeInfoObtain2.addAction(524288);
                    }
                }
                accessibilityNodeInfoObtain2.setHeading(fVar.C > 0);
                f fVar9 = this.f43487i;
                if (fVar9 == null || fVar9.f43452b != i10) {
                    accessibilityNodeInfoObtain2.addAction(64);
                } else {
                    accessibilityNodeInfoObtain2.addAction(128);
                }
                ArrayList<e> arrayList2 = fVar.V;
                if (arrayList2 != null) {
                    for (e eVar : arrayList2) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(eVar.f43445a, eVar.f43448d));
                    }
                }
                for (f fVar10 : fVar.T) {
                    if (!fVar10.g(14)) {
                        int i19 = fVar10.f43461i;
                        if (i19 != -1) {
                            View viewB0 = hVar.b0(i19);
                            if (!hVar.t0(fVar10.f43461i) && viewB0 != null) {
                                viewB0.setImportantForAccessibility(0);
                                accessibilityNodeInfoObtain2.addChild(viewB0);
                            }
                        }
                        accessibilityNodeInfoObtain2.addChild(view, fVar10.f43452b);
                    }
                }
                return accessibilityNodeInfoObtain2;
            }
            View viewB1 = hVar.b0(fVar.f43461i);
            if (viewB1 != null) {
                return accessibilityViewEmbedder.getRootNode(viewB1, fVar.f43452b, fVar.f43455c0);
            }
        }
        return null;
    }

    public final AccessibilityEvent e(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        View view = this.f43479a;
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i10);
        return accessibilityEventObtain;
    }

    public final boolean f(MotionEvent motionEvent, boolean z10) {
        f fVarH;
        if (this.f43481c.isTouchExplorationEnabled()) {
            HashMap map = this.f43485g;
            if (!map.isEmpty()) {
                f fVarH2 = ((f) map.get(0)).h(new float[]{motionEvent.getX(), motionEvent.getY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, z10);
                if (fVarH2 == null || fVarH2.f43461i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        if (!map.isEmpty() && (fVarH = ((f) map.get(0)).h(new float[]{x10, y10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, z10)) != this.f43493p) {
                            if (fVarH != null) {
                                h(fVarH.f43452b, 128);
                            }
                            f fVar = this.f43493p;
                            if (fVar != null) {
                                h(fVar.f43452b, NotificationCompat.FLAG_LOCAL_ONLY);
                            }
                            this.f43493p = fVarH;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        f fVar2 = this.f43493p;
                        if (fVar2 != null) {
                            h(fVar2.f43452b, NotificationCompat.FLAG_LOCAL_ONLY);
                            this.f43493p = null;
                        }
                    }
                    return true;
                }
                if (!z10) {
                    return this.f43482d.onAccessibilityHoverEvent(fVarH2.f43452b, motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        if (i10 == 1) {
            f fVar = this.f43491n;
            if (fVar != null) {
                return createAccessibilityNodeInfo(fVar.f43452b);
            }
            Integer num = this.f43489k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i10 != 2) {
            return null;
        }
        f fVar2 = this.f43487i;
        if (fVar2 != null) {
            return createAccessibilityNodeInfo(fVar2.f43452b);
        }
        Integer num2 = this.f43488j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final boolean g(f fVar, int i10, Bundle bundle, boolean z10) {
        int i11;
        int i12 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i13 = fVar.f43459g;
        int i14 = fVar.f43460h;
        if (i14 >= 0 && i13 >= 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 == 8 || i12 == 16) {
                            if (z10) {
                                fVar.f43460h = fVar.f43469r.length();
                            } else {
                                fVar.f43460h = 0;
                            }
                        }
                    } else if (z10 && i14 < fVar.f43469r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(fVar.f43469r.substring(fVar.f43460h));
                        if (matcher.find()) {
                            fVar.f43460h += matcher.start(1);
                        } else {
                            fVar.f43460h = fVar.f43469r.length();
                        }
                    } else if (!z10 && fVar.f43460h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(fVar.f43469r.substring(0, fVar.f43460h));
                        if (matcher2.find()) {
                            fVar.f43460h = matcher2.start(1);
                        } else {
                            fVar.f43460h = 0;
                        }
                    }
                } else if (z10 && i14 < fVar.f43469r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(fVar.f43469r.substring(fVar.f43460h));
                    matcher3.find();
                    if (matcher3.find()) {
                        fVar.f43460h += matcher3.start(1);
                    } else {
                        fVar.f43460h = fVar.f43469r.length();
                    }
                } else if (!z10 && fVar.f43460h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(fVar.f43469r.substring(0, fVar.f43460h));
                    if (matcher4.find()) {
                        fVar.f43460h = matcher4.start(1);
                    }
                }
            } else if (z10 && i14 < fVar.f43469r.length()) {
                fVar.f43460h++;
            } else if (!z10 && (i11 = fVar.f43460h) > 0) {
                fVar.f43460h = i11 - 1;
            }
            if (!z11) {
                fVar.f43459g = fVar.f43460h;
            }
        }
        if (i13 != fVar.f43459g || i14 != fVar.f43460h) {
            String str = fVar.f43469r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventE = e(fVar.f43452b, Segment.SIZE);
            accessibilityEventE.getText().add(str);
            accessibilityEventE.setFromIndex(fVar.f43459g);
            accessibilityEventE.setToIndex(fVar.f43460h);
            accessibilityEventE.setItemCount(str.length());
            i(accessibilityEventE);
        }
        qd.i iVar = this.f43480b;
        if (i12 == 1) {
            if (z10) {
                d dVar = d.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (f.a(fVar, dVar)) {
                    iVar.r(i10, dVar, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (!z10) {
                d dVar2 = d.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (f.a(fVar, dVar2)) {
                    iVar.r(i10, dVar2, Boolean.valueOf(z11));
                    return true;
                }
            }
        } else if (i12 == 2) {
            if (z10) {
                d dVar3 = d.MOVE_CURSOR_FORWARD_BY_WORD;
                if (f.a(fVar, dVar3)) {
                    iVar.r(i10, dVar3, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (!z10) {
                d dVar4 = d.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (f.a(fVar, dVar4)) {
                    iVar.r(i10, dVar4, Boolean.valueOf(z11));
                    return true;
                }
            }
        } else if (i12 == 4 || i12 == 8 || i12 == 16) {
            return true;
        }
        return false;
    }

    public final void h(int i10, int i11) {
        if (this.f43481c.isEnabled()) {
            i(e(i10, i11));
        }
    }

    public final void i(AccessibilityEvent accessibilityEvent) {
        if (this.f43481c.isEnabled()) {
            View view = this.f43479a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void j(boolean z10) {
        if (this.f43497t == z10) {
            return;
        }
        this.f43497t = z10;
        if (z10) {
            this.l |= 1;
        } else {
            this.l &= -2;
        }
        ((FlutterJNI) this.f43480b.f48981c).setAccessibilityFeatures(this.l);
    }

    public final boolean k(f fVar) {
        if (fVar.f43462j > 1) {
            f fVar2 = this.f43487i;
            f fVar3 = null;
            if (fVar2 != null) {
                f fVar4 = fVar2.S;
                while (true) {
                    if (fVar4 == null) {
                        fVar4 = null;
                        break;
                    }
                    if (fVar4 == fVar) {
                        break;
                    }
                    fVar4 = fVar4.S;
                }
                if (fVar4 != null) {
                    return true;
                }
            }
            f fVar5 = this.f43487i;
            fc.b bVar = new fc.b(1);
            if (fVar5 != null) {
                for (f fVar6 = fVar5.S; fVar6 != null; fVar6 = fVar6.S) {
                    if (bVar.test(fVar6)) {
                        fVar3 = fVar6;
                        break;
                    }
                }
                if (fVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        if (i10 >= 65536) {
            boolean zPerformAction = this.f43482d.performAction(i10, i11, bundle);
            if (zPerformAction && i11 == 128) {
                this.f43488j = null;
            }
            return zPerformAction;
        }
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f43485g;
        f fVar = (f) map.get(numValueOf);
        if (fVar != null) {
            d dVar = d.INCREASE;
            d dVar2 = d.DECREASE;
            qd.i iVar = this.f43480b;
            switch (i11) {
                case 16:
                    iVar.q(i10, d.TAP);
                    return true;
                case 32:
                    iVar.q(i10, d.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f43487i == null) {
                        this.f43479a.invalidate();
                    }
                    this.f43487i = fVar;
                    iVar.q(i10, d.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap map2 = new HashMap();
                    map2.put("type", "didGainFocus");
                    map2.put("nodeId", Integer.valueOf(fVar.f43452b));
                    ((k5.g) iVar.f48980b).y(map2, null);
                    h(i10, 32768);
                    if (!f.a(fVar, dVar) && !f.a(fVar, dVar2)) {
                        return true;
                    }
                    h(i10, 4);
                    return true;
                case 128:
                    f fVar2 = this.f43487i;
                    if (fVar2 != null && fVar2.f43452b == i10) {
                        this.f43487i = null;
                    }
                    Integer num = this.f43488j;
                    if (num != null && num.intValue() == i10) {
                        this.f43488j = null;
                    }
                    iVar.q(i10, d.DID_LOSE_ACCESSIBILITY_FOCUS);
                    h(i10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    return true;
                case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                    return g(fVar, i10, bundle, true);
                case 512:
                    return g(fVar, i10, bundle, false);
                case 4096:
                    d dVar3 = d.SCROLL_UP;
                    if (f.a(fVar, dVar3)) {
                        iVar.q(i10, dVar3);
                        return true;
                    }
                    d dVar4 = d.SCROLL_LEFT;
                    if (f.a(fVar, dVar4)) {
                        iVar.q(i10, dVar4);
                        return true;
                    }
                    if (f.a(fVar, dVar)) {
                        fVar.f43469r = fVar.f43471t;
                        fVar.f43470s = fVar.f43472u;
                        h(i10, 4);
                        iVar.q(i10, dVar);
                        return true;
                    }
                    break;
                case Segment.SIZE /* 8192 */:
                    d dVar5 = d.SCROLL_DOWN;
                    if (f.a(fVar, dVar5)) {
                        iVar.q(i10, dVar5);
                        return true;
                    }
                    d dVar6 = d.SCROLL_RIGHT;
                    if (f.a(fVar, dVar6)) {
                        iVar.q(i10, dVar6);
                        return true;
                    }
                    if (f.a(fVar, dVar2)) {
                        fVar.f43469r = fVar.f43473v;
                        fVar.f43470s = fVar.f43474w;
                        h(i10, 4);
                        iVar.q(i10, dVar2);
                        return true;
                    }
                    break;
                case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                    iVar.q(i10, d.COPY);
                    return true;
                case 32768:
                    iVar.q(i10, d.PASTE);
                    return true;
                case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                    iVar.q(i10, d.CUT);
                    return true;
                case 131072:
                    HashMap map3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        map3.put(TtmlNode.ATTR_TTS_EXTENT, Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        map3.put("base", Integer.valueOf(fVar.f43460h));
                        map3.put(TtmlNode.ATTR_TTS_EXTENT, Integer.valueOf(fVar.f43460h));
                    }
                    iVar.r(i10, d.SET_SELECTION, map3);
                    f fVar3 = (f) map.get(Integer.valueOf(i10));
                    fVar3.f43459g = ((Integer) map3.get("base")).intValue();
                    fVar3.f43460h = ((Integer) map3.get(TtmlNode.ATTR_TTS_EXTENT)).intValue();
                    return true;
                case 262144:
                    iVar.q(i10, d.EXPAND);
                    return true;
                case 524288:
                    iVar.q(i10, d.COLLAPSE);
                    return true;
                case ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES /* 1048576 */:
                    iVar.q(i10, d.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    iVar.r(i10, d.SET_TEXT, string);
                    fVar.f43469r = string;
                    fVar.f43470s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    iVar.q(i10, d.SHOW_ON_SCREEN);
                    return true;
                default:
                    e eVar = (e) this.f43486h.get(Integer.valueOf(i11 - 267386881));
                    if (eVar != null) {
                        iVar.r(i10, d.CUSTOM_ACTION, Integer.valueOf(eVar.f43446b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}

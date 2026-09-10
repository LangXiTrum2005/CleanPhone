package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.dj;
import com.startapp.sdk.internal.wi;
import com.startapp.sdk.internal.xi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = -1841622077369870410L;

    @TypeInfo(type = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;

    @TypeInfo(type = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    private boolean isVAST;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClickTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    public final AbsoluteTrackingLink[] a() {
        return this.absoluteTrackingUrls;
    }

    public final ActionTrackingLink[] b() {
        return this.creativeViewUrls;
    }

    public final FractionTrackingLink[] c() {
        return this.fractionTrackingUrls;
    }

    public final ActionTrackingLink[] d() {
        return this.impressionUrls;
    }

    public final ActionTrackingLink[] e() {
        return this.inlineErrorTrackingUrls;
    }

    public final ActionTrackingLink[] f() {
        return this.soundMuteUrls;
    }

    public final ActionTrackingLink[] g() {
        return this.soundUnmuteUrls;
    }

    public final ActionTrackingLink[] h() {
        return this.videoClickTrackingUrls;
    }

    public final ActionTrackingLink[] i() {
        return this.videoClosedUrls;
    }

    public final ActionTrackingLink[] j() {
        return this.videoPausedUrls;
    }

    public final ActionTrackingLink[] k() {
        return this.isVAST ? this.videoPostRollClickTrackingUrls : this.videoClickTrackingUrls;
    }

    public final ActionTrackingLink[] l() {
        return this.videoPostRollClosedUrls;
    }

    public final ActionTrackingLink[] m() {
        return this.videoPostRollImpressionUrls;
    }

    public final ActionTrackingLink[] n() {
        return this.videoResumedUrls;
    }

    public final ActionTrackingLink[] o() {
        return this.videoRewardedUrls;
    }

    public final ActionTrackingLink[] p() {
        return this.videoSkippedUrls;
    }

    public VideoTrackingDetails(xi xiVar) {
        AbsoluteTrackingLink[] absoluteTrackingLinkArr;
        this.isVAST = true;
        this.impressionUrls = a(xiVar.f41682b);
        this.soundMuteUrls = a(xiVar.f41686i);
        this.soundUnmuteUrls = a(xiVar.j);
        this.videoPausedUrls = a(xiVar.f41684e);
        this.videoResumedUrls = a(xiVar.f);
        this.videoSkippedUrls = a(xiVar.k);
        this.videoClosedUrls = a(xiVar.f41685h);
        this.inlineErrorTrackingUrls = a(xiVar.f41681a);
        this.videoClickTrackingUrls = a(xiVar.f41687l);
        ArrayList<dj> arrayList = xiVar.f41683c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (dj djVar : arrayList) {
                AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
                absoluteTrackingLink.a(djVar.f40920a);
                if (((Integer) djVar.f40921b).intValue() != -1) {
                    absoluteTrackingLink.a(((Integer) djVar.f40921b).intValue());
                }
                absoluteTrackingLink.d();
                absoluteTrackingLink.e();
                arrayList2.add(absoluteTrackingLink);
            }
            absoluteTrackingLinkArr = (AbsoluteTrackingLink[]) arrayList2.toArray(new AbsoluteTrackingLink[0]);
        } else {
            absoluteTrackingLinkArr = new AbsoluteTrackingLink[0];
        }
        this.absoluteTrackingUrls = absoluteTrackingLinkArr;
        ArrayList<dj> arrayList3 = xiVar.d;
        ArrayList<String> arrayList4 = xiVar.g;
        ArrayList arrayList5 = new ArrayList(arrayList3.size());
        for (dj djVar2 : arrayList3) {
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.a(djVar2.f40920a);
            fractionTrackingLink.a((int) (((Float) djVar2.f40921b).floatValue() * 100.0f));
            fractionTrackingLink.d();
            fractionTrackingLink.e();
            arrayList5.add(fractionTrackingLink);
        }
        for (String str : arrayList4) {
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.a(str);
            fractionTrackingLink2.a(100);
            fractionTrackingLink2.d();
            fractionTrackingLink2.e();
            arrayList5.add(fractionTrackingLink2);
        }
        this.fractionTrackingUrls = arrayList5.size() > 0 ? (FractionTrackingLink[]) arrayList5.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
        wi wiVar = xiVar.o;
        if (wiVar != null) {
            this.videoPostRollImpressionUrls = a(wiVar.f);
            this.videoPostRollClickTrackingUrls = a(wiVar.f41642e);
        }
    }

    public static ActionTrackingLink[] a(List list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.a(str);
            actionTrackingLink.d();
            actionTrackingLink.e();
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[0]);
    }
}

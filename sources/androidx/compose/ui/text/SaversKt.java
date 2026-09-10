package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontWeight;
import clubfoot.ParagraphStyle;
import clubfoot.SpanStyle;
import clubfoot.UrlAnnotation;
import clubfoot.VerbatimTtsAnnotation;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import milliradian.dovishness;
import milliradian.graveside;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import permissivist.LocaleList;
import restrictive.Shadow;
import restrictive.dent;
import restrictive.overspeculate;
import stratoscope.cutely;
import stratoscope.taiyuan;
import timberyard.TextGeometricTransform;
import timberyard.TextIndent;
import timberyard.impromptu;

/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\".\u0010\u001c\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001a0\u0019\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\".\u0010 \u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001a\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u0012\u0004\b\u001e\u0010\u001f\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015\"&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b%\u0010\u0015\u0012\u0004\b&\u0010\u001f\" \u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0015\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0015\"&\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b/\u0010\u0017\"&\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b2\u0010\u0017\"&\u00107\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b6\u0010\u0017\" \u0010:\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0015\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0015\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0015\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0015\" \u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0015\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0015\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0015\" \u0010P\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010O\" \u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010O\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0015\" \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0015\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0000*\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010]\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010`\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010b\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010d\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010f\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010h\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010j\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u0000*\u00020k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010l\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0\u0000*\u00020m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010n\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u0000*\u00020o8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010p\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u0000*\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010r\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u0000*\u00020s8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010t¨\u0006u"}, d2 = {"Lstratoscope/beachfront;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Original", "Saveable", "value", "saver", "Lstratoscope/cutely;", "scope", "", "preprohormone", "(Ljava/lang/Object;Lstratoscope/beachfront;Lstratoscope/cutely;)Ljava/lang/Object;", "Lkotlin/Function2;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/ui/text/marial;", "attabal", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/marial;", "rotuma", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/attabal;", "Lstratoscope/beachfront;", "impromptu", "()Lstratoscope/beachfront;", "AnnotatedStringSaver", "", "Landroidx/compose/ui/text/attabal$saneness;", "saneness", "AnnotationRangeListSaver", "dern", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Lclubfoot/apical;", "wireman", "VerbatimTtsAnnotationSaver", "Lclubfoot/cutely;", "marial", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Landroidx/compose/ui/text/dern$saneness;", "beachfront", "LinkSaver", "Landroidx/compose/ui/text/dern$attabal;", "competently", "ClickableSaver", "Lclubfoot/saneness;", "taiyuan", "ParagraphStyleSaver", "Lclubfoot/marial;", "dovishness", "SpanStyleSaver", "Lclubfoot/competently;", "cutely", "gintrap", "TextLinkStylesSaver", "Ltimberyard/impromptu;", "apical", "TextDecorationSaver", "Ltimberyard/apical;", "formularize", "TextGeometricTransformSaver", "Ltimberyard/formularize;", "impassible", "TextIndentSaver", "Landroidx/compose/ui/text/font/graveside;", "triweekly", "FontWeightSaver", "Ltimberyard/attabal;", "kowloon", "BaselineShiftSaver", "Landroidx/compose/ui/text/competently;", "arytenoidectomy", "TextRangeSaver", "Lrestrictive/preterite;", "monoploid", "ShadowSaver", "Lrestrictive/overspeculate;", "polloi", "Landroidx/compose/ui/text/marial;", "ColorSaver", "Lmilliradian/graveside;", "molybdenite", "TextUnitSaver", "Lsupplicat/competently;", "graveside", "OffsetSaver", "Lpermissivist/marial;", "adultoid", "LocaleListSaver", "Lpermissivist/wireman;", "LocaleSaver", "Ltimberyard/impromptu$attabal;", "(Ltimberyard/impromptu$attabal;)Lstratoscope/beachfront;", "Saver", "Ltimberyard/apical$attabal;", "(Ltimberyard/apical$attabal;)Lstratoscope/beachfront;", "Ltimberyard/formularize$attabal;", "(Ltimberyard/formularize$attabal;)Lstratoscope/beachfront;", "Landroidx/compose/ui/text/font/graveside$attabal;", "(Landroidx/compose/ui/text/font/graveside$attabal;)Lstratoscope/beachfront;", "Ltimberyard/attabal$attabal;", "(Ltimberyard/attabal$attabal;)Lstratoscope/beachfront;", "Landroidx/compose/ui/text/competently$attabal;", "(Landroidx/compose/ui/text/competently$attabal;)Lstratoscope/beachfront;", "Lrestrictive/preterite$attabal;", "(Lrestrictive/preterite$attabal;)Lstratoscope/beachfront;", "Lrestrictive/overspeculate$attabal;", "(Lrestrictive/overspeculate$attabal;)Lstratoscope/beachfront;", "Lmilliradian/graveside$attabal;", "(Lmilliradian/graveside$attabal;)Lstratoscope/beachfront;", "Lsupplicat/competently$attabal;", "(Lsupplicat/competently$attabal;)Lstratoscope/beachfront;", "Lpermissivist/marial$attabal;", "(Lpermissivist/marial$attabal;)Lstratoscope/beachfront;", "Lpermissivist/wireman$attabal;", "(Lpermissivist/wireman$attabal;)Lstratoscope/beachfront;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SaversKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope.beachfront<androidx.compose.ui.text.attabal, Object> f7671attabal = taiyuan.marial(new Function2<cutely, androidx.compose.ui.text.attabal, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, attabal attabalVar) {
            return adultoid.competently(SaversKt.rotuma(attabalVar.getText()), SaversKt.preprohormone(attabalVar.beachfront(), SaversKt.f7686saneness, cutelyVar), SaversKt.preprohormone(attabalVar.marial(), SaversKt.f7686saneness, cutelyVar), SaversKt.preprohormone(attabalVar.saneness(), SaversKt.f7686saneness, cutelyVar));
        }
    }, new Function1<Object, androidx.compose.ui.text.attabal>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final attabal invoke(Object obj) {
            List list;
            List list2;
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list3 = (List) obj;
            Object obj2 = list3.get(1);
            stratoscope.beachfront beachfrontVar = SaversKt.f7686saneness;
            Boolean bool = Boolean.FALSE;
            List list4 = null;
            List list5 = ((!Intrinsics.wireman(obj2, bool) || (beachfrontVar instanceof marial)) && obj2 != null) ? (List) beachfrontVar.saneness(obj2) : null;
            Object obj3 = list3.get(2);
            stratoscope.beachfront beachfrontVar2 = SaversKt.f7686saneness;
            List list6 = ((!Intrinsics.wireman(obj3, bool) || (beachfrontVar2 instanceof marial)) && obj3 != null) ? (List) beachfrontVar2.saneness(obj3) : null;
            Object obj4 = list3.get(0);
            String str = obj4 != null ? (String) obj4 : null;
            Intrinsics.beachfront(str);
            if (list5 != null) {
                List list7 = list5;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list = list7;
            } else {
                list = null;
            }
            if (list6 != null) {
                List list8 = list6;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list2 = list8;
            } else {
                list2 = null;
            }
            Object obj5 = list3.get(3);
            stratoscope.beachfront beachfrontVar3 = SaversKt.f7686saneness;
            if ((!Intrinsics.wireman(obj5, bool) || (beachfrontVar3 instanceof marial)) && obj5 != null) {
                list4 = (List) beachfrontVar3.saneness(obj5);
            }
            return new attabal(str, list, list2, list4);
        }
    });

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final stratoscope.beachfront<List<androidx.compose.ui.text.attabal.Range<? extends Object>>, Object> f7686saneness = taiyuan.marial(new Function2<cutely, List<? extends androidx.compose.ui.text.attabal.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, List<? extends attabal.Range<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(SaversKt.preprohormone(list.get(i), SaversKt.f7675dern, cutelyVar));
            }
            return arrayList;
        }
    }, new Function1<Object, List<? extends androidx.compose.ui.text.attabal.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        public final List<? extends attabal.Range<? extends Object>> invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                stratoscope.beachfront beachfrontVar = SaversKt.f7675dern;
                attabal.Range range = null;
                if ((!Intrinsics.wireman(obj2, Boolean.FALSE) || (beachfrontVar instanceof marial)) && obj2 != null) {
                    range = (attabal.Range) beachfrontVar.saneness(obj2);
                }
                Intrinsics.beachfront(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final stratoscope.beachfront<androidx.compose.ui.text.attabal.Range<? extends Object>, Object> f7675dern = taiyuan.marial(new Function2<cutely, androidx.compose.ui.text.attabal.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        /* JADX INFO: compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f7690attabal;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f7690attabal = iArr;
            }
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, androidx.compose.ui.text.attabal.Range<? extends Object> range) {
            AnnotationType annotationType;
            Object objPreprohormone;
            Object objMarial = range.marial();
            if (objMarial instanceof ParagraphStyle) {
                annotationType = AnnotationType.Paragraph;
            } else if (objMarial instanceof SpanStyle) {
                annotationType = AnnotationType.Span;
            } else if (objMarial instanceof VerbatimTtsAnnotation) {
                annotationType = AnnotationType.VerbatimTts;
            } else if (objMarial instanceof UrlAnnotation) {
                annotationType = AnnotationType.Url;
            } else if (objMarial instanceof dern.saneness) {
                annotationType = AnnotationType.Link;
            } else {
                annotationType = objMarial instanceof dern.attabal ? AnnotationType.Clickable : AnnotationType.String;
            }
            switch (attabal.f7690attabal[annotationType.ordinal()]) {
                case 1:
                    Object objMarial2 = range.marial();
                    Intrinsics.competently(objMarial2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objPreprohormone = SaversKt.preprohormone((ParagraphStyle) objMarial2, SaversKt.taiyuan(), cutelyVar);
                    break;
                case 2:
                    Object objMarial3 = range.marial();
                    Intrinsics.competently(objMarial3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objPreprohormone = SaversKt.preprohormone((SpanStyle) objMarial3, SaversKt.dovishness(), cutelyVar);
                    break;
                case 3:
                    Object objMarial4 = range.marial();
                    Intrinsics.competently(objMarial4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objPreprohormone = SaversKt.preprohormone((VerbatimTtsAnnotation) objMarial4, SaversKt.f7689wireman, cutelyVar);
                    break;
                case 4:
                    Object objMarial5 = range.marial();
                    Intrinsics.competently(objMarial5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objPreprohormone = SaversKt.preprohormone((UrlAnnotation) objMarial5, SaversKt.f7682marial, cutelyVar);
                    break;
                case 5:
                    Object objMarial6 = range.marial();
                    Intrinsics.competently(objMarial6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    objPreprohormone = SaversKt.preprohormone((dern.saneness) objMarial6, SaversKt.f7672beachfront, cutelyVar);
                    break;
                case 6:
                    Object objMarial7 = range.marial();
                    Intrinsics.competently(objMarial7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    objPreprohormone = SaversKt.preprohormone((dern.attabal) objMarial7, SaversKt.f7673competently, cutelyVar);
                    break;
                case 7:
                    objPreprohormone = SaversKt.rotuma(range.marial());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return adultoid.competently(SaversKt.rotuma(annotationType), objPreprohormone, SaversKt.rotuma(Integer.valueOf(range.getStart())), SaversKt.rotuma(Integer.valueOf(range.wireman())), SaversKt.rotuma(range.getTag()));
        }
    }, new Function1<Object, androidx.compose.ui.text.attabal.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        /* JADX INFO: compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f7691attabal;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f7691attabal = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final androidx.compose.ui.text.attabal.Range<? extends Object> invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ParagraphStyle paragraphStyleSaneness = null;
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            Intrinsics.beachfront(annotationType);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            Intrinsics.beachfront(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            Intrinsics.beachfront(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            Intrinsics.beachfront(str);
            switch (attabal.f7691attabal[annotationType.ordinal()]) {
                case 1:
                    Object obj6 = list.get(1);
                    stratoscope.beachfront<ParagraphStyle, Object> beachfrontVarTaiyuan = SaversKt.taiyuan();
                    if ((!Intrinsics.wireman(obj6, Boolean.FALSE) || (beachfrontVarTaiyuan instanceof marial)) && obj6 != null) {
                        paragraphStyleSaneness = beachfrontVarTaiyuan.saneness(obj6);
                    }
                    Intrinsics.beachfront(paragraphStyleSaneness);
                    return new androidx.compose.ui.text.attabal.Range<>(paragraphStyleSaneness, iIntValue, iIntValue2, str);
                case 2:
                    Object obj7 = list.get(1);
                    stratoscope.beachfront<SpanStyle, Object> beachfrontVarDovishness = SaversKt.dovishness();
                    if ((!Intrinsics.wireman(obj7, Boolean.FALSE) || (beachfrontVarDovishness instanceof marial)) && obj7 != null) {
                        paragraphStyleSaneness = beachfrontVarDovishness.saneness(obj7);
                    }
                    Intrinsics.beachfront(paragraphStyleSaneness);
                    return new androidx.compose.ui.text.attabal.Range<>(paragraphStyleSaneness, iIntValue, iIntValue2, str);
                case 3:
                    Object obj8 = list.get(1);
                    stratoscope.beachfront beachfrontVar = SaversKt.f7689wireman;
                    if ((!Intrinsics.wireman(obj8, Boolean.FALSE) || (beachfrontVar instanceof marial)) && obj8 != null) {
                        paragraphStyleSaneness = (VerbatimTtsAnnotation) beachfrontVar.saneness(obj8);
                    }
                    Intrinsics.beachfront(paragraphStyleSaneness);
                    return new androidx.compose.ui.text.attabal.Range<>(paragraphStyleSaneness, iIntValue, iIntValue2, str);
                case 4:
                    Object obj9 = list.get(1);
                    stratoscope.beachfront beachfrontVar2 = SaversKt.f7682marial;
                    if ((!Intrinsics.wireman(obj9, Boolean.FALSE) || (beachfrontVar2 instanceof marial)) && obj9 != null) {
                        paragraphStyleSaneness = (UrlAnnotation) beachfrontVar2.saneness(obj9);
                    }
                    Intrinsics.beachfront(paragraphStyleSaneness);
                    return new androidx.compose.ui.text.attabal.Range<>(paragraphStyleSaneness, iIntValue, iIntValue2, str);
                case 5:
                    Object obj10 = list.get(1);
                    stratoscope.beachfront beachfrontVar3 = SaversKt.f7672beachfront;
                    if ((!Intrinsics.wireman(obj10, Boolean.FALSE) || (beachfrontVar3 instanceof marial)) && obj10 != null) {
                        paragraphStyleSaneness = (dern.saneness) beachfrontVar3.saneness(obj10);
                    }
                    Intrinsics.beachfront(paragraphStyleSaneness);
                    return new androidx.compose.ui.text.attabal.Range<>(paragraphStyleSaneness, iIntValue, iIntValue2, str);
                case 6:
                    Object obj11 = list.get(1);
                    stratoscope.beachfront beachfrontVar4 = SaversKt.f7673competently;
                    if ((!Intrinsics.wireman(obj11, Boolean.FALSE) || (beachfrontVar4 instanceof marial)) && obj11 != null) {
                        paragraphStyleSaneness = (dern.attabal) beachfrontVar4.saneness(obj11);
                    }
                    Intrinsics.beachfront(paragraphStyleSaneness);
                    return new androidx.compose.ui.text.attabal.Range<>(paragraphStyleSaneness, iIntValue, iIntValue2, str);
                case 7:
                    Object obj12 = list.get(1);
                    paragraphStyleSaneness = obj12 != null ? (String) obj12 : null;
                    Intrinsics.beachfront(paragraphStyleSaneness);
                    return new androidx.compose.ui.text.attabal.Range<>(paragraphStyleSaneness, iIntValue, iIntValue2, str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    });

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final stratoscope.beachfront<VerbatimTtsAnnotation, Object> f7689wireman = taiyuan.marial(new Function2<cutely, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return SaversKt.rotuma(verbatimTtsAnnotation.getVerbatim());
        }
    }, new Function1<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            Intrinsics.beachfront(str);
            return new VerbatimTtsAnnotation(str);
        }
    });

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final stratoscope.beachfront<UrlAnnotation, Object> f7682marial = taiyuan.marial(new Function2<cutely, UrlAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, UrlAnnotation urlAnnotation) {
            return SaversKt.rotuma(urlAnnotation.getUrl());
        }
    }, new Function1<Object, UrlAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            Intrinsics.beachfront(str);
            return new UrlAnnotation(str);
        }
    });

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final stratoscope.beachfront<dern.saneness, Object> f7672beachfront = taiyuan.marial(new Function2<cutely, dern.saneness, Object>() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, dern.saneness sanenessVar) {
            return adultoid.competently(SaversKt.rotuma(sanenessVar.getUrl()), SaversKt.preprohormone(sanenessVar.getStyles(), SaversKt.gintrap(), cutelyVar));
        }
    }, new Function1<Object, dern.saneness>() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final dern.saneness invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            clubfoot.competently competentlyVarSaneness = null;
            String str = obj2 != null ? (String) obj2 : null;
            Intrinsics.beachfront(str);
            Object obj3 = list.get(1);
            stratoscope.beachfront<clubfoot.competently, Object> beachfrontVarGintrap = SaversKt.gintrap();
            if ((!Intrinsics.wireman(obj3, Boolean.FALSE) || (beachfrontVarGintrap instanceof marial)) && obj3 != null) {
                competentlyVarSaneness = beachfrontVarGintrap.saneness(obj3);
            }
            return new dern.saneness(str, competentlyVarSaneness, null, 4, null);
        }
    });

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final stratoscope.beachfront<dern.attabal, Object> f7673competently = taiyuan.marial(new Function2<cutely, dern.attabal, Object>() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, dern.attabal attabalVar) {
            return adultoid.competently(SaversKt.rotuma(attabalVar.getTag()), SaversKt.preprohormone(attabalVar.getStyles(), SaversKt.gintrap(), cutelyVar));
        }
    }, new Function1<Object, dern.attabal>() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final dern.attabal invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            String str = obj2 != null ? (String) obj2 : null;
            Intrinsics.beachfront(str);
            Object obj3 = list.get(1);
            stratoscope.beachfront<clubfoot.competently, Object> beachfrontVarGintrap = SaversKt.gintrap();
            return new dern.attabal(str, ((!Intrinsics.wireman(obj3, Boolean.FALSE) || (beachfrontVarGintrap instanceof marial)) && obj3 != null) ? beachfrontVarGintrap.saneness(obj3) : null, null);
        }
    });

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final stratoscope.beachfront<ParagraphStyle, Object> f7680impromptu = taiyuan.marial(new Function2<cutely, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, ParagraphStyle paragraphStyle) {
            return adultoid.competently(SaversKt.rotuma(timberyard.competently.saneness(paragraphStyle.getTextAlign())), SaversKt.rotuma(timberyard.taiyuan.saneness(paragraphStyle.getTextDirection())), SaversKt.preprohormone(graveside.saneness(paragraphStyle.getLineHeight()), SaversKt.formularize(graveside.INSTANCE), cutelyVar), SaversKt.preprohormone(paragraphStyle.getTextIndent(), SaversKt.adultoid(TextIndent.INSTANCE), cutelyVar));
        }
    }, new Function1<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final ParagraphStyle invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextIndent textIndentSaneness = null;
            timberyard.competently competentlyVar = obj2 != null ? (timberyard.competently) obj2 : null;
            Intrinsics.beachfront(competentlyVar);
            int value = competentlyVar.getValue();
            Object obj3 = list.get(1);
            timberyard.taiyuan taiyuanVar = obj3 != null ? (timberyard.taiyuan) obj3 : null;
            Intrinsics.beachfront(taiyuanVar);
            int value2 = taiyuanVar.getValue();
            Object obj4 = list.get(2);
            stratoscope.beachfront<graveside, Object> beachfrontVarFormularize = SaversKt.formularize(graveside.INSTANCE);
            Boolean bool = Boolean.FALSE;
            graveside gravesideVarSaneness = ((!Intrinsics.wireman(obj4, bool) || (beachfrontVarFormularize instanceof marial)) && obj4 != null) ? beachfrontVarFormularize.saneness(obj4) : null;
            Intrinsics.beachfront(gravesideVarSaneness);
            long packedValue = gravesideVarSaneness.getPackedValue();
            Object obj5 = list.get(3);
            stratoscope.beachfront<TextIndent, Object> beachfrontVarAdultoid = SaversKt.adultoid(TextIndent.INSTANCE);
            if ((!Intrinsics.wireman(obj5, bool) || (beachfrontVarAdultoid instanceof marial)) && obj5 != null) {
                textIndentSaneness = beachfrontVarAdultoid.saneness(obj5);
            }
            return new ParagraphStyle(value, value2, packedValue, textIndentSaneness, null, null, 0, 0, null, 496, null);
        }
    });

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final stratoscope.beachfront<SpanStyle, Object> f7687taiyuan = taiyuan.marial(new Function2<cutely, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, SpanStyle spanStyle) {
            overspeculate overspeculateVarBeachfront = overspeculate.beachfront(spanStyle.competently());
            overspeculate.Companion companion = overspeculate.INSTANCE;
            Object objPreprohormone = SaversKt.preprohormone(overspeculateVarBeachfront, SaversKt.kowloon(companion), cutelyVar);
            graveside gravesideVarSaneness = graveside.saneness(spanStyle.getFontSize());
            graveside.Companion companion2 = graveside.INSTANCE;
            return adultoid.competently(objPreprohormone, SaversKt.preprohormone(gravesideVarSaneness, SaversKt.formularize(companion2), cutelyVar), SaversKt.preprohormone(spanStyle.getFontWeight(), SaversKt.apical(FontWeight.INSTANCE), cutelyVar), SaversKt.rotuma(spanStyle.getFontStyle()), SaversKt.rotuma(spanStyle.getFontSynthesis()), SaversKt.rotuma(-1), SaversKt.rotuma(spanStyle.getFontFeatureSettings()), SaversKt.preprohormone(graveside.saneness(spanStyle.getLetterSpacing()), SaversKt.formularize(companion2), cutelyVar), SaversKt.preprohormone(spanStyle.getBaselineShift(), SaversKt.polloi(timberyard.attabal.INSTANCE), cutelyVar), SaversKt.preprohormone(spanStyle.getTextGeometricTransform(), SaversKt.graveside(TextGeometricTransform.INSTANCE), cutelyVar), SaversKt.preprohormone(spanStyle.getLocaleList(), SaversKt.triweekly(LocaleList.INSTANCE), cutelyVar), SaversKt.preprohormone(overspeculate.beachfront(spanStyle.getBackground()), SaversKt.kowloon(companion), cutelyVar), SaversKt.preprohormone(spanStyle.getTextDecoration(), SaversKt.molybdenite(impromptu.INSTANCE), cutelyVar), SaversKt.preprohormone(spanStyle.getShadow(), SaversKt.arytenoidectomy(Shadow.INSTANCE), cutelyVar));
        }
    }, new Function1<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 clubfoot.marial, still in use, count: 2, list:
              (r1v1 clubfoot.marial) from 0x00d8: MOVE (r16v2 clubfoot.marial) = (r1v1 clubfoot.marial)
              (r1v1 clubfoot.marial) from 0x00d0: MOVE (r16v7 clubfoot.marial) = (r1v1 clubfoot.marial)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // p002kotlin.jvm.functions.Function1
        public final clubfoot.SpanStyle invoke(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 450
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2.invoke(java.lang.Object):clubfoot.marial");
        }
    });

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final stratoscope.beachfront<clubfoot.competently, Object> f7674cutely = taiyuan.marial(new Function2<cutely, clubfoot.competently, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, clubfoot.competently competentlyVar) {
            return adultoid.competently(SaversKt.preprohormone(competentlyVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_STYLE java.lang.String(), SaversKt.dovishness(), cutelyVar), SaversKt.preprohormone(competentlyVar.getFocusedStyle(), SaversKt.dovishness(), cutelyVar), SaversKt.preprohormone(competentlyVar.getHoveredStyle(), SaversKt.dovishness(), cutelyVar), SaversKt.preprohormone(competentlyVar.getPressedStyle(), SaversKt.dovishness(), cutelyVar));
        }
    }, new Function1<Object, clubfoot.competently>() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final clubfoot.competently invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            stratoscope.beachfront<SpanStyle, Object> beachfrontVarDovishness = SaversKt.dovishness();
            Boolean bool = Boolean.FALSE;
            SpanStyle spanStyleSaneness = null;
            SpanStyle spanStyleSaneness2 = ((!Intrinsics.wireman(obj2, bool) || (beachfrontVarDovishness instanceof marial)) && obj2 != null) ? beachfrontVarDovishness.saneness(obj2) : null;
            Object obj3 = list.get(1);
            stratoscope.beachfront<SpanStyle, Object> beachfrontVarDovishness2 = SaversKt.dovishness();
            SpanStyle spanStyleSaneness3 = ((!Intrinsics.wireman(obj3, bool) || (beachfrontVarDovishness2 instanceof marial)) && obj3 != null) ? beachfrontVarDovishness2.saneness(obj3) : null;
            Object obj4 = list.get(2);
            stratoscope.beachfront<SpanStyle, Object> beachfrontVarDovishness3 = SaversKt.dovishness();
            SpanStyle spanStyleSaneness4 = ((!Intrinsics.wireman(obj4, bool) || (beachfrontVarDovishness3 instanceof marial)) && obj4 != null) ? beachfrontVarDovishness3.saneness(obj4) : null;
            Object obj5 = list.get(3);
            stratoscope.beachfront<SpanStyle, Object> beachfrontVarDovishness4 = SaversKt.dovishness();
            if ((!Intrinsics.wireman(obj5, bool) || (beachfrontVarDovishness4 instanceof marial)) && obj5 != null) {
                spanStyleSaneness = beachfrontVarDovishness4.saneness(obj5);
            }
            return new clubfoot.competently(spanStyleSaneness2, spanStyleSaneness3, spanStyleSaneness4, spanStyleSaneness);
        }
    });

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final stratoscope.beachfront<impromptu, Object> f7669apical = taiyuan.marial(new Function2<cutely, impromptu, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, impromptu impromptuVar) {
            return Integer.valueOf(impromptuVar.wireman());
        }
    }, new Function1<Object, impromptu>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        public final impromptu invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Int");
            return new impromptu(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final stratoscope.beachfront<TextGeometricTransform, Object> f7677formularize = taiyuan.marial(new Function2<cutely, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, TextGeometricTransform textGeometricTransform) {
            return adultoid.competently(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }, new Function1<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        public final TextGeometricTransform invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final stratoscope.beachfront<TextIndent, Object> f7679impassible = taiyuan.marial(new Function2<cutely, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, TextIndent textIndent) {
            graveside gravesideVarSaneness = graveside.saneness(textIndent.getFirstLine());
            graveside.Companion companion = graveside.INSTANCE;
            return adultoid.competently(SaversKt.preprohormone(gravesideVarSaneness, SaversKt.formularize(companion), cutelyVar), SaversKt.preprohormone(graveside.saneness(textIndent.getRestLine()), SaversKt.formularize(companion), cutelyVar));
        }
    }, new Function1<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        public final TextIndent invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            graveside.Companion companion = graveside.INSTANCE;
            stratoscope.beachfront<graveside, Object> beachfrontVarFormularize = SaversKt.formularize(companion);
            Boolean bool = Boolean.FALSE;
            graveside gravesideVarSaneness = null;
            graveside gravesideVarSaneness2 = ((!Intrinsics.wireman(obj2, bool) || (beachfrontVarFormularize instanceof marial)) && obj2 != null) ? beachfrontVarFormularize.saneness(obj2) : null;
            Intrinsics.beachfront(gravesideVarSaneness2);
            long packedValue = gravesideVarSaneness2.getPackedValue();
            Object obj3 = list.get(1);
            stratoscope.beachfront<graveside, Object> beachfrontVarFormularize2 = SaversKt.formularize(companion);
            if ((!Intrinsics.wireman(obj3, bool) || (beachfrontVarFormularize2 instanceof marial)) && obj3 != null) {
                gravesideVarSaneness = beachfrontVarFormularize2.saneness(obj3);
            }
            Intrinsics.beachfront(gravesideVarSaneness);
            return new TextIndent(packedValue, gravesideVarSaneness.getPackedValue(), null);
        }
    });

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final stratoscope.beachfront<FontWeight, Object> f7688triweekly = taiyuan.marial(new Function2<cutely, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.getWeight());
        }
    }, new Function1<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function1
        public final FontWeight invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FontWeight(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final stratoscope.beachfront<timberyard.attabal, Object> f7681kowloon = taiyuan.marial(new Function2<cutely, timberyard.attabal, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(cutely cutelyVar, timberyard.attabal attabalVar) {
            return m12invoke8a2Sb4w(cutelyVar, attabalVar.getMultiplier());
        }

        /* JADX INFO: renamed from: invoke-8a2Sb4w, reason: not valid java name */
        public final Object m12invoke8a2Sb4w(cutely cutelyVar, float f) {
            return Float.valueOf(f);
        }
    }, new Function1<Object, timberyard.attabal>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
        public final timberyard.attabal invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Float");
            return timberyard.attabal.attabal(timberyard.attabal.saneness(((Float) obj).floatValue()));
        }
    });

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final stratoscope.beachfront<competently, Object> f7670arytenoidectomy = taiyuan.marial(new Function2<cutely, competently, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(cutely cutelyVar, competently competentlyVar) {
            return m18invokeFDrldGo(cutelyVar, competentlyVar.getPackedValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke-FDrldGo, reason: not valid java name */
        public final Object m18invokeFDrldGo(cutely cutelyVar, long j) {
            return adultoid.competently(SaversKt.rotuma(Integer.valueOf(competently.cutely(j))), SaversKt.rotuma(Integer.valueOf(competently.competently(j))));
        }
    }, new Function1<Object, competently>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
        public final competently invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            Intrinsics.beachfront(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            Intrinsics.beachfront(num2);
            return competently.saneness(clubfoot.impromptu.saneness(iIntValue, num2.intValue()));
        }
    });

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final stratoscope.beachfront<Shadow, Object> f7684monoploid = taiyuan.marial(new Function2<cutely, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, Shadow shadow) {
            return adultoid.competently(SaversKt.preprohormone(overspeculate.beachfront(shadow.getColor()), SaversKt.kowloon(overspeculate.INSTANCE), cutelyVar), SaversKt.preprohormone(supplicat.competently.wireman(shadow.getOffset()), SaversKt.monoploid(supplicat.competently.INSTANCE), cutelyVar), SaversKt.rotuma(Float.valueOf(shadow.getBlurRadius())));
        }
    }, new Function1<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        public final Shadow invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            stratoscope.beachfront<overspeculate, Object> beachfrontVarKowloon = SaversKt.kowloon(overspeculate.INSTANCE);
            Boolean bool = Boolean.FALSE;
            overspeculate overspeculateVarSaneness = ((!Intrinsics.wireman(obj2, bool) || (beachfrontVarKowloon instanceof marial)) && obj2 != null) ? beachfrontVarKowloon.saneness(obj2) : null;
            Intrinsics.beachfront(overspeculateVarSaneness);
            long value = overspeculateVarSaneness.getValue();
            Object obj3 = list.get(1);
            stratoscope.beachfront<supplicat.competently, Object> beachfrontVarMonoploid = SaversKt.monoploid(supplicat.competently.INSTANCE);
            supplicat.competently competentlyVarSaneness = ((!Intrinsics.wireman(obj3, bool) || (beachfrontVarMonoploid instanceof marial)) && obj3 != null) ? beachfrontVarMonoploid.saneness(obj3) : null;
            Intrinsics.beachfront(competentlyVarSaneness);
            long packedValue = competentlyVarSaneness.getPackedValue();
            Object obj4 = list.get(2);
            Float f = obj4 != null ? (Float) obj4 : null;
            Intrinsics.beachfront(f);
            return new Shadow(value, packedValue, f.floatValue(), null);
        }
    });

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final marial<overspeculate, Object> f7685polloi = attabal(new Function2<cutely, overspeculate, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(cutely cutelyVar, overspeculate overspeculateVar) {
            return m14invoke4WTKRHQ(cutelyVar, overspeculateVar.getValue());
        }

        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m14invoke4WTKRHQ(cutely cutelyVar, long j) {
            return j == 16 ? Boolean.FALSE : Integer.valueOf(dent.wireman(j));
        }
    }, new Function1<Object, overspeculate>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final overspeculate invoke(Object obj) {
            long jSaneness;
            if (Intrinsics.wireman(obj, Boolean.FALSE)) {
                jSaneness = overspeculate.INSTANCE.marial();
            } else {
                Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Int");
                jSaneness = dent.saneness(((Integer) obj).intValue());
            }
            return overspeculate.beachfront(jSaneness);
        }
    });

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final marial<graveside, Object> f7683molybdenite = attabal(new Function2<cutely, graveside, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(cutely cutelyVar, graveside gravesideVar) {
            return m20invokempE4wyQ(cutelyVar, gravesideVar.getPackedValue());
        }

        /* JADX INFO: renamed from: invoke-mpE4wyQ, reason: not valid java name */
        public final Object m20invokempE4wyQ(cutely cutelyVar, long j) {
            return graveside.marial(j, graveside.INSTANCE.attabal()) ? Boolean.FALSE : adultoid.competently(SaversKt.rotuma(Float.valueOf(graveside.impromptu(j))), SaversKt.rotuma(dovishness.wireman(graveside.competently(j))));
        }
    }, new Function1<Object, graveside>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
        public final graveside invoke(Object obj) {
            if (Intrinsics.wireman(obj, Boolean.FALSE)) {
                return graveside.saneness(graveside.INSTANCE.attabal());
            }
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f = obj2 != null ? (Float) obj2 : null;
            Intrinsics.beachfront(f);
            float fFloatValue = f.floatValue();
            Object obj3 = list.get(1);
            dovishness dovishnessVar = obj3 != null ? (dovishness) obj3 : null;
            Intrinsics.beachfront(dovishnessVar);
            return graveside.saneness(milliradian.adultoid.attabal(fFloatValue, dovishnessVar.getType()));
        }
    });

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final marial<supplicat.competently, Object> f7678graveside = attabal(new Function2<cutely, supplicat.competently, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(cutely cutelyVar, supplicat.competently competentlyVar) {
            return m16invokeUv8p0NA(cutelyVar, competentlyVar.getPackedValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final Object m16invokeUv8p0NA(cutely cutelyVar, long j) {
            return supplicat.competently.taiyuan(j, supplicat.competently.INSTANCE.saneness()) ? Boolean.FALSE : adultoid.competently(SaversKt.rotuma(Float.valueOf(supplicat.competently.apical(j))), SaversKt.rotuma(Float.valueOf(supplicat.competently.formularize(j))));
        }
    }, new Function1<Object, supplicat.competently>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
        public final supplicat.competently invoke(Object obj) {
            if (Intrinsics.wireman(obj, Boolean.FALSE)) {
                return supplicat.competently.wireman(supplicat.competently.INSTANCE.saneness());
            }
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f = obj2 != null ? (Float) obj2 : null;
            Intrinsics.beachfront(f);
            float fFloatValue = f.floatValue();
            Object obj3 = list.get(1);
            Float f2 = obj3 != null ? (Float) obj3 : null;
            Intrinsics.beachfront(f2);
            return supplicat.competently.wireman(supplicat.impromptu.attabal(fFloatValue, f2.floatValue()));
        }
    });

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final stratoscope.beachfront<LocaleList, Object> f7668adultoid = taiyuan.marial(new Function2<cutely, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, LocaleList localeList) {
            List<permissivist.wireman> listMarial = localeList.marial();
            ArrayList arrayList = new ArrayList(listMarial.size());
            int size = listMarial.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(SaversKt.preprohormone(listMarial.get(i), SaversKt.impassible(permissivist.wireman.INSTANCE), cutelyVar));
            }
            return arrayList;
        }
    }, new Function1<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        public final LocaleList invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                stratoscope.beachfront<permissivist.wireman, Object> beachfrontVarImpassible = SaversKt.impassible(permissivist.wireman.INSTANCE);
                permissivist.wireman wiremanVarSaneness = null;
                if ((!Intrinsics.wireman(obj2, Boolean.FALSE) || (beachfrontVarImpassible instanceof marial)) && obj2 != null) {
                    wiremanVarSaneness = beachfrontVarImpassible.saneness(obj2);
                }
                Intrinsics.beachfront(wiremanVarSaneness);
                arrayList.add(wiremanVarSaneness);
            }
            return new LocaleList(arrayList);
        }
    });

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final stratoscope.beachfront<permissivist.wireman, Object> f7676dovishness = taiyuan.marial(new Function2<cutely, permissivist.wireman, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(cutely cutelyVar, permissivist.wireman wiremanVar) {
            return wiremanVar.saneness();
        }
    }, new Function1<Object, permissivist.wireman>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        @Override // p002kotlin.jvm.functions.Function1
        public final permissivist.wireman invoke(Object obj) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.String");
            return new permissivist.wireman((String) obj);
        }
    });

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* JADX INFO: compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/ui/text/SaversKt$attabal", "Landroidx/compose/ui/text/marial;", "Lstratoscope/cutely;", "value", "attabal", "(Lstratoscope/cutely;Ljava/lang/Object;)Ljava/lang/Object;", "saneness", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal<Original, Saveable> implements marial<Original, Saveable> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Function2<cutely, Original, Saveable> f7692attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Function1<Saveable, Original> f7693saneness;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Function2<? super cutely, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.f7692attabal = function2;
            this.f7693saneness = function1;
        }

        @Override // stratoscope.beachfront
        public Saveable attabal(cutely cutelyVar, Original original) {
            return this.f7692attabal.invoke(cutelyVar, original);
        }

        @Override // stratoscope.beachfront
        public Original saneness(Saveable value) {
            return this.f7693saneness.invoke(value);
        }
    }

    public static final stratoscope.beachfront<TextIndent, Object> adultoid(TextIndent.Companion companion) {
        return f7679impassible;
    }

    public static final stratoscope.beachfront<FontWeight, Object> apical(FontWeight.Companion companion) {
        return f7688triweekly;
    }

    public static final stratoscope.beachfront<Shadow, Object> arytenoidectomy(Shadow.Companion attabalVar) {
        return f7684monoploid;
    }

    public static final <Original, Saveable> marial<Original, Saveable> attabal(Function2<? super cutely, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        return new attabal(function2, function1);
    }

    public static final stratoscope.beachfront<competently, Object> cutely(competently.Companion companion) {
        return f7670arytenoidectomy;
    }

    public static final stratoscope.beachfront<SpanStyle, Object> dovishness() {
        return f7687taiyuan;
    }

    public static final stratoscope.beachfront<graveside, Object> formularize(graveside.Companion companion) {
        return f7683molybdenite;
    }

    public static final stratoscope.beachfront<clubfoot.competently, Object> gintrap() {
        return f7674cutely;
    }

    public static final stratoscope.beachfront<TextGeometricTransform, Object> graveside(TextGeometricTransform.Companion companion) {
        return f7677formularize;
    }

    public static final stratoscope.beachfront<permissivist.wireman, Object> impassible(permissivist.wireman.Companion companion) {
        return f7676dovishness;
    }

    public static final stratoscope.beachfront<androidx.compose.ui.text.attabal, Object> impromptu() {
        return f7671attabal;
    }

    public static final stratoscope.beachfront<overspeculate, Object> kowloon(overspeculate.Companion companion) {
        return f7685polloi;
    }

    public static final stratoscope.beachfront<impromptu, Object> molybdenite(impromptu.Companion companion) {
        return f7669apical;
    }

    public static final stratoscope.beachfront<supplicat.competently, Object> monoploid(supplicat.competently.Companion companion) {
        return f7678graveside;
    }

    public static final stratoscope.beachfront<timberyard.attabal, Object> polloi(timberyard.attabal.Companion companion) {
        return f7681kowloon;
    }

    public static final <T extends stratoscope.beachfront<Original, Saveable>, Original, Saveable> Object preprohormone(Original original, T t, cutely cutelyVar) {
        Object objAttabal;
        return (original == null || (objAttabal = t.attabal(cutelyVar, original)) == null) ? Boolean.FALSE : objAttabal;
    }

    public static final stratoscope.beachfront<ParagraphStyle, Object> taiyuan() {
        return f7680impromptu;
    }

    public static final stratoscope.beachfront<LocaleList, Object> triweekly(LocaleList.Companion attabalVar) {
        return f7668adultoid;
    }

    public static final <T> T rotuma(T t) {
        return t;
    }
}

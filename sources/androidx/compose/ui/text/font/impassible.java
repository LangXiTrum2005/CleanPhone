package androidx.compose.ui.text.font;

import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Landroidx/compose/ui/text/font/impromptu;", "Landroidx/compose/ui/text/font/seminary;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/cord;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "saneness", "(Ljava/util/List;Landroidx/compose/ui/text/font/seminary;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/cord;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class impassible {
    public static final Pair<List<impromptu>, Object> saneness(List<? extends impromptu> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, cord cordVar, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object result;
        Object objM3351constructorimpl;
        Object result2;
        int size = list.size();
        List listPolloi = null;
        for (int i = 0; i < size; i++) {
            impromptu impromptuVar = list.get(i);
            int loadingStrategy = impromptuVar.getLoadingStrategy();
            triweekly.Companion companion = triweekly.INSTANCE;
            if (triweekly.beachfront(loadingStrategy, companion.saneness())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(impromptuVar, cordVar.getCacheKey());
                        AsyncTypefaceCache.attabal attabalVar = (AsyncTypefaceCache.attabal) asyncTypefaceCache.resultCache.wireman(key);
                        if (attabalVar == null) {
                            attabalVar = (AsyncTypefaceCache.attabal) asyncTypefaceCache.permanentCache.saneness(key);
                        }
                        if (attabalVar != null) {
                            result = attabalVar.getResult();
                        } else {
                            Unit unit = Unit.f29295attabal;
                            try {
                                Object objSaneness = cordVar.saneness(impromptuVar);
                                AsyncTypefaceCache.beachfront(asyncTypefaceCache, impromptuVar, cordVar, objSaneness, false, 8, null);
                                result = objSaneness;
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + impromptuVar, e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (result != null) {
                    return patroclinal.formularize.attabal(listPolloi, polloi.attabal(typefaceRequest.getFontSynthesis(), result, impromptuVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
                throw new IllegalStateException("Unable to load font " + impromptuVar);
            }
            if (triweekly.beachfront(loadingStrategy, companion.dern())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(impromptuVar, cordVar.getCacheKey());
                        AsyncTypefaceCache.attabal attabalVar2 = (AsyncTypefaceCache.attabal) asyncTypefaceCache.resultCache.wireman(key2);
                        if (attabalVar2 == null) {
                            attabalVar2 = (AsyncTypefaceCache.attabal) asyncTypefaceCache.permanentCache.saneness(key2);
                        }
                        if (attabalVar2 != null) {
                            result2 = attabalVar2.getResult();
                        } else {
                            Unit unit2 = Unit.f29295attabal;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM3351constructorimpl = Result.m3351constructorimpl(cordVar.saneness(impromptuVar));
                            } catch (Throwable th2) {
                                Result.Companion companion3 = Result.INSTANCE;
                                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
                            }
                            Object obj = Result.m3356isFailureimpl(objM3351constructorimpl) ? null : objM3351constructorimpl;
                            AsyncTypefaceCache.beachfront(asyncTypefaceCache, impromptuVar, cordVar, obj, false, 8, null);
                            result2 = obj;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (result2 != null) {
                    return patroclinal.formularize.attabal(listPolloi, polloi.attabal(typefaceRequest.getFontSynthesis(), result2, impromptuVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            } else {
                if (!triweekly.beachfront(loadingStrategy, companion.attabal())) {
                    throw new IllegalStateException("Unknown font type " + impromptuVar);
                }
                AsyncTypefaceCache.attabal attabalVarWireman = asyncTypefaceCache.wireman(impromptuVar, cordVar);
                if (attabalVarWireman != null) {
                    if (!AsyncTypefaceCache.attabal.marial(attabalVarWireman.getResult()) && attabalVarWireman.getResult() != null) {
                        return patroclinal.formularize.attabal(listPolloi, polloi.attabal(typefaceRequest.getFontSynthesis(), attabalVarWireman.getResult(), impromptuVar, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                    }
                } else if (listPolloi == null) {
                    listPolloi = p002kotlin.collections.adultoid.polloi(impromptuVar);
                } else {
                    listPolloi.add(impromptuVar);
                }
            }
        }
        return patroclinal.formularize.attabal(listPolloi, function1.invoke(typefaceRequest));
    }
}

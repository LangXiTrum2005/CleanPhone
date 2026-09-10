package com.thinkup.core.api;

import android.support.v4.media.a;
import android.util.Log;
import android.util.Pair;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0nn;
import com.thinkup.core.common.ooo.omn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUAdFilter {
    private static final String KEY_BIDDING_TYPE = "biddingType";
    private static final String KEY_E_CPM = "e_cpm";
    private static final String KEY_NETWORK_ID = "networkId";
    private static final String KEY_NETWORK_PLACEMENT_ID = "networkPlacementId";
    private static final String TAG = "thinkup_ad_filter";
    private final Stack<Map<String, Object>> stack = new Stack<>();

    public interface m {
        Pair<Boolean, AdError> filter(Map<String, Object> map, o0nn o0nnVar);
    }

    public static class n implements m {
        @Override // com.thinkup.core.api.TUAdFilter.m
        public final Pair<Boolean, AdError> filter(Map<String, Object> map, o0nn o0nnVar) {
            try {
                Object obj = map.get(TUAdFilter.KEY_NETWORK_PLACEMENT_ID);
                if (obj != null && o0nnVar != null && (obj instanceof List)) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        return list.contains(o0nnVar.m) ? new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadUnitFilterError, "", "Filter by network adUnitId.")) : new Pair<>(Boolean.TRUE, null);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    public static class o {
        Map<String, Object> filterCondition;
        o0nn filterData;
        List<m> list;

        public o(Map<String, Object> map, o0nn o0nnVar) {
            this.filterCondition = map;
            this.filterData = o0nnVar;
            ArrayList arrayList = new ArrayList();
            this.list = arrayList;
            arrayList.add(new oo());
            this.list.add(new o0());
            this.list.add(new om());
            this.list.add(new n());
        }

        public final AdError filter() {
            Object obj;
            ArrayList arrayList = new ArrayList();
            List<m> list = this.list;
            if (list == null || list.isEmpty()) {
                return null;
            }
            Iterator<m> it = this.list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Pair<Boolean, AdError> pairFilter = it.next().filter(this.filterCondition, this.filterData);
                if (pairFilter != null && (obj = pairFilter.first) != null && ((Boolean) obj).booleanValue()) {
                    i2++;
                    Object obj2 = pairFilter.second;
                    if (obj2 != null) {
                        arrayList.add((AdError) obj2);
                    }
                }
            }
            if (arrayList.isEmpty() || arrayList.size() != i2) {
                return null;
            }
            return (AdError) a.d(1, arrayList);
        }
    }

    public static class o0 implements m {
        @Override // com.thinkup.core.api.TUAdFilter.m
        public final Pair<Boolean, AdError> filter(Map<String, Object> map, o0nn o0nnVar) {
            try {
                Object obj = map.get(TUAdFilter.KEY_BIDDING_TYPE);
                if (obj != null && o0nnVar != null && (obj instanceof List)) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        return list.contains(o0nnVar.m()) ? new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadBidTypeFilterError, "", "Filter by bid type.")) : new Pair<>(Boolean.TRUE, null);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    public static class om implements m {
        @Override // com.thinkup.core.api.TUAdFilter.m
        public final Pair<Boolean, AdError> filter(Map<String, Object> map, o0nn o0nnVar) {
            TUWaterfallFilter.PriceInterval priceInterval;
            TUAdConst.CURRENCY scurrency;
            double rmbChangeToUsdRate;
            try {
                Object obj = map.get(TUAdFilter.KEY_E_CPM);
                if (obj != null && o0nnVar != null && (obj instanceof TUWaterfallFilter.PriceInterval) && (scurrency = (priceInterval = (TUWaterfallFilter.PriceInterval) obj).getScurrency()) != null) {
                    if (scurrency == TUAdConst.CURRENCY.RMB) {
                        rmbChangeToUsdRate = TUSDKUtils.getRmbChangeToUsdRate();
                    } else {
                        rmbChangeToUsdRate = scurrency == TUAdConst.CURRENCY.RMB_CENT ? TUSDKUtils.getRmbChangeToUsdRate() * 100.0d : 1.0d;
                    }
                    omn.m(TUAdFilter.TAG, "filter price coefficient:".concat(String.valueOf(rmbChangeToUsdRate)));
                    if (rmbChangeToUsdRate != 0.0d) {
                        if (priceInterval.getMorePrice() != null && priceInterval.getLessPrice() != null) {
                            omn.m(TUAdFilter.TAG, "filter price getMorePrice:" + (priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate));
                            omn.m(TUAdFilter.TAG, "filter price getLessPrice:" + (priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate));
                            omn.m(TUAdFilter.TAG, "filter price getPrice:" + o0nnVar.o());
                            if (priceInterval.getMorePrice().doubleValue() == priceInterval.getLessPrice().doubleValue()) {
                                if (o0nnVar.o() != priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate) {
                                    return new Pair<>(Boolean.TRUE, null);
                                }
                                o0nnVar.o(priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate);
                                return new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadPriceFilterError, "", "Filter by bid price."));
                            }
                            if (priceInterval.getLessPrice().doubleValue() > priceInterval.getMorePrice().doubleValue()) {
                                if (o0nnVar.o() < priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate || o0nnVar.o() > priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate) {
                                    return new Pair<>(Boolean.TRUE, null);
                                }
                                o0nnVar.o(priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate);
                                return new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadPriceFilterError, "", "Filter by bid price."));
                            }
                            if (o0n.m().m0o()) {
                                Log.e(TUAdFilter.TAG, "filter price min and max is exception:" + priceInterval.getLessPrice() + ":" + priceInterval.getMorePrice());
                            }
                            return new Pair<>(Boolean.TRUE, null);
                        }
                        if (priceInterval.getMorePrice() != null) {
                            omn.m(TUAdFilter.TAG, "filter price getMorePrice:" + (priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate));
                            omn.m(TUAdFilter.TAG, "filter price getPrice:" + o0nnVar.o());
                            if (o0nnVar.o() < priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate) {
                                return new Pair<>(Boolean.TRUE, null);
                            }
                            o0nnVar.o(priceInterval.getMorePrice().doubleValue() * rmbChangeToUsdRate);
                            return new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadPriceFilterError, "", "Filter by bid price."));
                        }
                        if (priceInterval.getLessPrice() != null) {
                            omn.m(TUAdFilter.TAG, "filter price getLessPrice:" + (priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate));
                            omn.m(TUAdFilter.TAG, "filter price getPrice:" + o0nnVar.o());
                            if (o0nnVar.o() <= 0.0d || o0nnVar.o() > priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate) {
                                return new Pair<>(Boolean.TRUE, null);
                            }
                            o0nnVar.o(priceInterval.getLessPrice().doubleValue() * rmbChangeToUsdRate);
                            return new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.adSourceLoadPriceFilterError, "", "Filter by bid price."));
                        }
                    } else if (o0n.m().m0o()) {
                        Log.e(TUAdFilter.TAG, "filter price coefficient is exception:".concat(String.valueOf(rmbChangeToUsdRate)));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    public static class oo implements m {
        @Override // com.thinkup.core.api.TUAdFilter.m
        public final Pair<Boolean, AdError> filter(Map<String, Object> map, o0nn o0nnVar) {
            try {
                Object obj = map.get(TUAdFilter.KEY_NETWORK_ID);
                if (obj != null && o0nnVar != null && (obj instanceof List)) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        return list.contains(o0nnVar.o) ? new Pair<>(Boolean.TRUE, ErrorCode.getErrorCode(ErrorCode.networkFirmIdFilterSourceError, "", "Filter by network firm id.")) : new Pair<>(Boolean.TRUE, null);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    private synchronized TUAdFilter filter(String str, Object obj) {
        try {
            Map<String, Object> mapPop = !this.stack.isEmpty() ? this.stack.pop() : null;
            if (mapPop == null) {
                mapPop = new HashMap<>();
            }
            mapPop.put(str, obj);
            this.stack.push(mapPop);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private String getStackJson() {
        try {
            if (this.stack.isEmpty()) {
                return "";
            }
            ArrayList arrayList = new ArrayList(this.stack);
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Map map = (Map) arrayList.get(i2);
                if (map != null && !map.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof TUWaterfallFilter.PriceInterval) {
                            jSONObject.put(str, ((TUWaterfallFilter.PriceInterval) value).getJsonObject());
                        } else if (value instanceof List) {
                            JSONArray jSONArray2 = new JSONArray();
                            Iterator it = ((List) value).iterator();
                            while (it.hasNext()) {
                                jSONArray2.put((String) it.next());
                            }
                            jSONObject.put(str, jSONArray2);
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final AdError doFilter(o0nn o0nnVar) {
        if (o0nnVar == null) {
            return null;
        }
        try {
            if (this.stack.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.stack);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Map map = (Map) arrayList.get(i2);
                if (map == null || map.isEmpty()) {
                    if (o0n.m().m0o()) {
                        Log.e(TAG, "doFilter start filterData useless filterCondition" + i2 + ":" + o0nnVar);
                    }
                } else if (o0nnVar.f42238n != 1 || !map.containsKey(KEY_E_CPM)) {
                    omn.m(TAG, "doFilter start filterData:" + i2 + ":" + o0nnVar);
                    AdError adErrorFilter = new o(map, o0nnVar).filter();
                    if (adErrorFilter != null) {
                        if (o0n.m().m0o()) {
                            Log.e(TAG, "doFilter  filter reason:".concat(String.valueOf(adErrorFilter)));
                        }
                        o0nnVar.o(getStackJson());
                        return adErrorFilter;
                    }
                } else if (o0n.m().m0o()) {
                    Log.e(TAG, "doFilter start filterData continue:" + i2 + ":" + o0nnVar);
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public TUAdFilter filterAdPrice(TUWaterfallFilter.PriceInterval priceInterval) {
        return filter(KEY_E_CPM, priceInterval);
    }

    public TUAdFilter filterBidTypes(List<String> list) {
        return filter(KEY_BIDDING_TYPE, list);
    }

    public TUAdFilter filterNetworkIds(List<String> list) {
        return filter(KEY_NETWORK_ID, list);
    }

    public TUAdFilter filterNetworkPlacementIds(List<String> list) {
        return filter(KEY_NETWORK_PLACEMENT_ID, list);
    }

    public synchronized TUAdFilter orFilter() {
        this.stack.push(new HashMap());
        return this;
    }
}

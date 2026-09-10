package com.thinkup.network.gtm;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.newinterstitial.out.MBBidInterstitialVideoHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBInterstitialHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import com.thinkup.core.api.ITUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUHandlerManager {
    private static volatile GTMTUHandlerManager o;
    private final Object mo = new Object();
    private Map<String, MBRewardVideoHandler> m = new ConcurrentHashMap(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, MBBidRewardVideoHandler> f42563n = new ConcurrentHashMap(3);
    private Map<String, MBInterstitialHandler> o0 = new ConcurrentHashMap(3);
    private Map<String, MBNewInterstitialHandler> oo = new ConcurrentHashMap(3);
    private Map<String, MBBidInterstitialVideoHandler> om = new ConcurrentHashMap(3);
    private Map<String, List<TUBaseAdAdapter>> on = new ConcurrentHashMap(3);
    private Map<String, TUBaseAdAdapter> m0 = new ConcurrentHashMap(3);

    public static class InitParams {
        String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f42564n;
        Context o;
    }

    public class m implements RewardVideoListener {
        String o;

        public /* synthetic */ m(GTMTUHandlerManager gTMTUHandlerManager, String str, byte b2) {
            this(str);
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof RewardVideoListener)) {
                return;
            }
            ((RewardVideoListener) showAdapter).onAdClose(mBridgeIds, rewardInfo);
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onAdShow(MBridgeIds mBridgeIds) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof RewardVideoListener)) {
                return;
            }
            ((RewardVideoListener) showAdapter).onAdShow(mBridgeIds);
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onEndcardShow(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onLoadSuccess(MBridgeIds mBridgeIds) {
            List<ITUBaseAdAdapter> listO = GTMTUHandlerManager.this.o(this.o);
            if (listO != null) {
                for (ITUBaseAdAdapter iTUBaseAdAdapter : listO) {
                    if (iTUBaseAdAdapter instanceof RewardVideoListener) {
                        ((RewardVideoListener) iTUBaseAdAdapter).onLoadSuccess(mBridgeIds);
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onShowFail(MBridgeIds mBridgeIds, String str) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof RewardVideoListener)) {
                return;
            }
            ((RewardVideoListener) showAdapter).onShowFail(mBridgeIds, str);
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof RewardVideoListener)) {
                return;
            }
            ((RewardVideoListener) showAdapter).onVideoAdClicked(mBridgeIds);
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onVideoComplete(MBridgeIds mBridgeIds) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof RewardVideoListener)) {
                return;
            }
            ((RewardVideoListener) showAdapter).onVideoComplete(mBridgeIds);
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
            List<ITUBaseAdAdapter> listO = GTMTUHandlerManager.this.o(this.o);
            if (listO != null) {
                for (ITUBaseAdAdapter iTUBaseAdAdapter : listO) {
                    if (iTUBaseAdAdapter instanceof RewardVideoListener) {
                        ((RewardVideoListener) iTUBaseAdAdapter).onVideoLoadFail(mBridgeIds, str);
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
            List<ITUBaseAdAdapter> listO = GTMTUHandlerManager.this.o(this.o);
            if (listO != null) {
                for (ITUBaseAdAdapter iTUBaseAdAdapter : listO) {
                    if (iTUBaseAdAdapter instanceof RewardVideoListener) {
                        ((RewardVideoListener) iTUBaseAdAdapter).onVideoLoadSuccess(mBridgeIds);
                    }
                }
            }
        }

        private m(String str) {
            this.o = str;
        }
    }

    public class o implements NewInterstitialListener {
        String o;

        public /* synthetic */ o(GTMTUHandlerManager gTMTUHandlerManager, String str, byte b2) {
            this(str);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onAdClicked(MBridgeIds mBridgeIds) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof NewInterstitialListener)) {
                return;
            }
            ((NewInterstitialListener) showAdapter).onAdClicked(mBridgeIds);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof NewInterstitialListener)) {
                return;
            }
            ((NewInterstitialListener) showAdapter).onAdClose(mBridgeIds, rewardInfo);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onAdShow(MBridgeIds mBridgeIds) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof NewInterstitialListener)) {
                return;
            }
            ((NewInterstitialListener) showAdapter).onAdShow(mBridgeIds);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onEndcardShow(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
            List<ITUBaseAdAdapter> listO = GTMTUHandlerManager.this.o(this.o);
            if (listO != null) {
                for (ITUBaseAdAdapter iTUBaseAdAdapter : listO) {
                    if (iTUBaseAdAdapter instanceof NewInterstitialListener) {
                        ((NewInterstitialListener) iTUBaseAdAdapter).onLoadCampaignSuccess(mBridgeIds);
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
            List<ITUBaseAdAdapter> listO = GTMTUHandlerManager.this.o(this.o);
            if (listO != null) {
                for (ITUBaseAdAdapter iTUBaseAdAdapter : listO) {
                    if (iTUBaseAdAdapter instanceof NewInterstitialListener) {
                        ((NewInterstitialListener) iTUBaseAdAdapter).onResourceLoadFail(mBridgeIds, str);
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
            List<ITUBaseAdAdapter> listO = GTMTUHandlerManager.this.o(this.o);
            if (listO != null) {
                for (ITUBaseAdAdapter iTUBaseAdAdapter : listO) {
                    if (iTUBaseAdAdapter instanceof NewInterstitialListener) {
                        ((NewInterstitialListener) iTUBaseAdAdapter).onResourceLoadSuccess(mBridgeIds);
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onShowFail(MBridgeIds mBridgeIds, String str) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof NewInterstitialListener)) {
                return;
            }
            ((NewInterstitialListener) showAdapter).onShowFail(mBridgeIds, str);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public final void onVideoComplete(MBridgeIds mBridgeIds) {
            ITUBaseAdAdapter showAdapter = GTMTUHandlerManager.this.getShowAdapter(this.o);
            if (showAdapter == null || !(showAdapter instanceof NewInterstitialListener)) {
                return;
            }
            ((NewInterstitialListener) showAdapter).onVideoComplete(mBridgeIds);
        }

        private o(String str) {
            this.o = str;
        }
    }

    private GTMTUHandlerManager() {
    }

    public static GTMTUHandlerManager getInstance() {
        if (o == null) {
            synchronized (GTMTUHandlerManager.class) {
                try {
                    if (o == null) {
                        o = new GTMTUHandlerManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public void addLoadAdapter(String str, TUBaseAdAdapter tUBaseAdAdapter) {
        synchronized (this.mo) {
            try {
                List<TUBaseAdAdapter> arrayList = this.on.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(3);
                }
                arrayList.add(tUBaseAdAdapter);
                this.on.put(str, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MBBidInterstitialVideoHandler getMBBidInterstitialVideoHandler(InitParams initParams) {
        MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler = this.om.get(initParams.f42564n);
        if (mBBidInterstitialVideoHandler != null) {
            return mBBidInterstitialVideoHandler;
        }
        MBBidInterstitialVideoHandler mBBidInterstitialVideoHandler2 = new MBBidInterstitialVideoHandler(initParams.o, initParams.m, initParams.f42564n);
        mBBidInterstitialVideoHandler2.setInterstitialVideoListener(new o(this, initParams.f42564n, (byte) 0));
        this.om.put(initParams.f42564n, mBBidInterstitialVideoHandler2);
        return mBBidInterstitialVideoHandler2;
    }

    public MBBidRewardVideoHandler getMBBidRewardVideoHandler(InitParams initParams) {
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f42563n.get(initParams.f42564n);
        if (mBBidRewardVideoHandler != null) {
            return mBBidRewardVideoHandler;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler2 = new MBBidRewardVideoHandler(initParams.o, initParams.m, initParams.f42564n);
        mBBidRewardVideoHandler2.setRewardVideoListener(new m(this, initParams.f42564n, (byte) 0));
        this.f42563n.put(initParams.f42564n, mBBidRewardVideoHandler2);
        return mBBidRewardVideoHandler2;
    }

    public MBNewInterstitialHandler getMBNewInterstitialHandler(InitParams initParams) {
        MBNewInterstitialHandler mBNewInterstitialHandler = this.oo.get(initParams.f42564n);
        if (mBNewInterstitialHandler != null) {
            return mBNewInterstitialHandler;
        }
        MBNewInterstitialHandler mBNewInterstitialHandler2 = new MBNewInterstitialHandler(initParams.o, initParams.m, initParams.f42564n);
        mBNewInterstitialHandler2.setInterstitialVideoListener(new o(this, initParams.f42564n, (byte) 0));
        this.oo.put(initParams.f42564n, mBNewInterstitialHandler2);
        return mBNewInterstitialHandler2;
    }

    public MBRewardVideoHandler getMBRewardVideoHandler(InitParams initParams) {
        MBRewardVideoHandler mBRewardVideoHandler = this.m.get(initParams.f42564n);
        if (mBRewardVideoHandler != null) {
            return mBRewardVideoHandler;
        }
        MBRewardVideoHandler mBRewardVideoHandler2 = new MBRewardVideoHandler(initParams.o, initParams.m, initParams.f42564n);
        mBRewardVideoHandler2.setRewardVideoListener((g) new m(this, initParams.f42564n, (byte) 0));
        this.m.put(initParams.f42564n, mBRewardVideoHandler2);
        return mBRewardVideoHandler2;
    }

    public TUBaseAdAdapter getShowAdapter(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.m0.get(str);
    }

    public void removeAdapter(String str, TUBaseAdAdapter tUBaseAdAdapter) {
        synchronized (this.mo) {
            try {
                List<TUBaseAdAdapter> list = this.on.get(str);
                if (list != null) {
                    list.remove(tUBaseAdAdapter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeMBBidInterstitialVideoHandler(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.om.remove(str);
    }

    public void removeMBBidRewardVideoHandler(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f42563n.remove(str);
    }

    public void removeMBNewInterstitialHandler(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.oo.remove(str);
    }

    public void removeMBRewardVideoHandler(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.m.remove(str);
    }

    public void setShowAdapter(String str, TUBaseAdAdapter tUBaseAdAdapter) {
        this.m0.put(str, tUBaseAdAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<TUBaseAdAdapter> o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        synchronized (this.mo) {
            try {
                List<TUBaseAdAdapter> list = this.on.get(str);
                if (list != null) {
                    arrayList.addAll(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }
}

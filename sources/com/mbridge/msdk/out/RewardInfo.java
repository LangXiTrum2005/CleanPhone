package com.mbridge.msdk.out;

import com.mbridge.msdk.system.NoProGuard;
import d5.u;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class RewardInfo implements Serializable, NoProGuard {
    private boolean isCompleteView;
    private int rewardAlertStatus;
    private String rewardAmount;
    private String rewardName;

    public RewardInfo(boolean z10, int i10) {
        this.isCompleteView = z10;
        this.rewardAlertStatus = i10;
    }

    public int getRewardAlertStatus() {
        return this.rewardAlertStatus;
    }

    public String getRewardAmount() {
        return this.rewardAmount;
    }

    public String getRewardName() {
        return this.rewardName;
    }

    public boolean isCompleteView() {
        return this.isCompleteView;
    }

    public void setCompleteView(boolean z10) {
        this.isCompleteView = z10;
    }

    public void setRewardAlertStatus(int i10) {
        this.rewardAlertStatus = i10;
    }

    public void setRewardAmount(String str) {
        this.rewardAmount = str;
    }

    public void setRewardName(String str) {
        this.rewardName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardInfo{isCompleteView=");
        sb2.append(this.isCompleteView);
        sb2.append(", rewardName='");
        sb2.append(this.rewardName);
        sb2.append("', rewardAmount='");
        sb2.append(this.rewardAmount);
        sb2.append("', rewardAlertStatus=");
        return u.g(sb2, this.rewardAlertStatus, '}');
    }

    public RewardInfo(boolean z10, String str, String str2) {
        this.isCompleteView = z10;
        this.rewardName = str;
        this.rewardAmount = str2;
    }

    public RewardInfo(boolean z10, String str, String str2, int i10) {
        this.isCompleteView = z10;
        this.rewardName = str;
        this.rewardAmount = str2;
        this.rewardAlertStatus = i10;
    }
}

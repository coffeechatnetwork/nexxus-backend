package com.nexxus.common;

import com.alibaba.ttl.TransmittableThreadLocal;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoContext {
    private static final TransmittableThreadLocal<AccountInfo> ACCOUNT_INFO = new TransmittableThreadLocal<>();

    public static void set(AccountInfo accountInfo) {
        ACCOUNT_INFO.set(accountInfo);
    }

    public static void remove() {
        ACCOUNT_INFO.remove();
    }

    public static AccountInfo get() {
        return ACCOUNT_INFO.get();
    }
}

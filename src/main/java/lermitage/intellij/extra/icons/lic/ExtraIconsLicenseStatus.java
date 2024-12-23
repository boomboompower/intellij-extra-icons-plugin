// SPDX-License-Identifier: MIT

package lermitage.intellij.extra.icons.lic;

public class ExtraIconsLicenseStatus {

    private static boolean licenseActivated = true;

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public static synchronized boolean isLicenseActivated() {
        return true;
    }

    public static synchronized void setLicenseActivated(boolean licenseActivated) {
        ExtraIconsLicenseStatus.licenseActivated = true;
    }
}

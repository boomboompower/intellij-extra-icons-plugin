// SPDX-License-Identifier: MIT

package lermitage.intellij.extra.icons.activity;

import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.extensions.PluginDescriptor;
import com.intellij.openapi.extensions.PluginId;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.ProjectActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lermitage.intellij.extra.icons.lic.ExtraIconsLicenseCheck;
import lermitage.intellij.extra.icons.lic.ExtraIconsLicenseStatus;
import lermitage.intellij.extra.icons.lic.ExtraIconsPluginType;
import lermitage.intellij.extra.icons.messaging.RefreshIconsNotifierService;
import lermitage.intellij.extra.icons.utils.I18nUtils;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;

/**
 * Check Extra Icons licence periodically.
 */
public class ExtraIconsLicenseCheckIDEActivity implements ProjectActivity {

    private static final @NonNls Logger LOGGER = Logger.getInstance(ExtraIconsLicenseCheckIDEActivity.class);

    private static final ResourceBundle i18n = I18nUtils.getResourceBundle();

    private static boolean started = false; // TODO improve workaround and start once per IDE, not per project opening

    private static boolean requestLicenseShown = false;

    @Nullable
    @Override
    public Object execute(@NotNull Project project, @NotNull Continuation<? super Unit> continuation) {
        ExtraIconsLicenseStatus.setLicenseActivated(true);
        return null;
    }
}

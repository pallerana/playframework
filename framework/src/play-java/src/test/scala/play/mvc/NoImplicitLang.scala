/*
 * Copyright (C) 2009-2018 Lightbend Inc. <https://www.lightbend.com>
 */

package play.mvc

import play.core.j.PlayMagicForJava._

object NoImplicitLang {
  def apply(lang: play.i18n.Lang): String = {
    ImplicitLangInclude()
  }
  def render(lang: play.i18n.Lang): String = apply(lang)
}

package vis.rhynia.nova.common.item

import net.minecraft.item.Item
import vis.rhynia.nova.client.NovaTab.TabMetaItem01
import vis.rhynia.nova.common.item.container.NovaItemUltimate
import vis.rhynia.nova.common.item.container.NovaMetaItem01
import vis.rhynia.nova.common.item.container.NovaMetaItem02

object ItemRecord {
  val ItemUltimate: Item = NovaItemUltimate(TabMetaItem01).setTextureName("nova:ultimate")
  val MetaItem01: Item = NovaMetaItem01()
  val MetaItem02: Item = NovaMetaItem02()
}

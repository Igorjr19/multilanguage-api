require_relative "boot"

require "rails"
require "action_controller/railtie"

Bundler.require(*Rails.groups)

module Ruby
  class Application < Rails::Application
    config.load_defaults 8.0
    config.api_only = true
  end
end

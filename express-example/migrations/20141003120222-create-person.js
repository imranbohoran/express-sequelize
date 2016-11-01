"use strict";

module.exports = {
  up: function(queryInterface, Sequelize) {
    return queryInterface
      .createTable('Person', {
        username: Sequelize.STRING
      });
  },

  down: function(queryInterface, Sequelize) {
    return queryInterface
      .dropTable('Person');
  }
};

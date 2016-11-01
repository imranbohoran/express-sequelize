#!/bin/bash
echo "Overriding config..."
cp /postgresql.conf /var/lib/postgresql/data/postgresql.conf

cat /var/lib/postgresql/data/postgresql.conf

echo "Overriding hba config.."
cp /pg_hba.conf /var/lib/postgresql/data/pg_hba.conf

cat /var/lib/postgresql/data/pg_hba.conf
